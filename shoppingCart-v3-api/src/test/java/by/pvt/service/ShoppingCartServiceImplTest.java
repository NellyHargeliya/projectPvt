package by.pvt.service;


//import by.pvt.model.shoppingcart.ShoppingCart;

import by.pvt.dao.ShoppingCartDaoImpl;
import by.pvt.model.shoppingcart.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import java.io.Serializable;
import java.util.List;

import io.swagger.configuration.HibernateXMLConfTest;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = {HibernateXMLConfTest.class},
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class ShoppingCartServiceImplTest {
    @MockBean
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;

    @MockBean
    HttpServletRequest httpServletRequest;

    @Resource
    ShoppingCartServiceImpl objUnderTest;
    @Resource
    ShoppingCartDaoImpl objUnderTestCartDao;

    public static ShoppingCart shoppingCart(String prefix) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setHref("localhost/" + prefix);
        Note note=new Note();
        note.setAuthor("Sidorov Vasy");
        note.setText("Test");
       // note.setId("2321");



        shoppingCart.setNote(List.of(note));
        shoppingCart.setCartItem(List.of(new CartItem()
                .itemPrice(List.of(new CartPrice()
                        .name("Anna Karenina")
                        .price(new Price()
                                .dutyFreeAmount(new Money()
                                        .unit("unit" + prefix).value((float) 12.34)))
                        .priceType("priceType")
                        .unitOfMeasure("OfMeasure")
                        .description("description cart")
                        .recurringChargePeriod("recurringChargePeriod")))
                .quantity(1)
                .action("action")
                .totalItemPrice(List.of(new CartPrice()
                        .name("Anna Karenina")
                        .price(new Price()
                                .dutyFreeAmount(new Money()
                                        .unit("unit_p" + prefix).value((float) 44.67)))
                        .priceType("priceType")
                        .unitOfMeasure("OfMeasure")
                        .description("description cart")
                        .recurringChargePeriod("recurringChargePeriod")))));


        shoppingCart.setCartTotalPrice(List.of(new CartPrice()
                .name("Anna Karenina")
                .price(new Price()
                        .dutyFreeAmount(new Money()
                                .unit("unit_p" + prefix).value((float) 44.67)))
                .priceType("priceType")
                .unitOfMeasure("OfMeasure")
                .description("description cart")
                .recurringChargePeriod("recurringChargePeriod")));

        shoppingCart.setContactMedium(List.of(new ContactMedium().type("")));


        return shoppingCart;
    }


    @Before
    public void setUp() throws Exception {
        //   objUnderTest = new ShoppingCartServiceImpl();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void savelist() {
        ShoppingCart shoppingCart1 = shoppingCart("1");
        objUnderTest.save(shoppingCart1);

        Serializable id = shoppingCart1.getId();
        assertNotNull(id);

        List<ShoppingCart> shoppingCartList = objUnderTest.list();
        assertTrue(shoppingCartList.size()==1);
        ShoppingCart shoppingCart=shoppingCartList.get(0);
        assertNotNull(shoppingCart);
        assertEquals(id,shoppingCart.getId());
        assertNotNull(shoppingCart.getCartItem());
        assertNotNull(shoppingCart.getCartTotalPrice());
        assertEquals("Sidorov Vasy",shoppingCart.getNote().get(0).getAuthor());
        assertEquals("Test",shoppingCart.getNote().get(0).getText());
       // assertEquals("2321",shoppingCart.getNote().get(0).getId());

        assertNotNull(shoppingCart.getContactMedium());
        assertNotNull(shoppingCart.getRelatedParty());


        assertEquals(1, shoppingCartList.size());
        assertEquals(id, shoppingCartList.get(0).getId());



    }


}