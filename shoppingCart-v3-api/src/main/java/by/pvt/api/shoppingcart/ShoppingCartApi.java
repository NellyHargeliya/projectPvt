/**
 * NOTE: This class is auto generated by the swagger code generator program (unset).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package by.pvt.api.shoppingcart;


import org.threeten.bp.OffsetDateTime;
import by.pvt.model.shoppingcart.ShoppingCart;
import by.pvt.model.shoppingcart.ShoppingCartCreate;
import by.pvt.model.shoppingcart.ShoppingCartUpdate;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")

@Api(value = "shoppingcart", description = "the shoppingcart API")
public interface ShoppingCartApi {

    @ApiOperation(value = "Creates a 'ShoppingCart'", nickname = "createShoppingCart", notes = "", response = ShoppingCart.class, tags = {"shoppingcart",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created", response = ShoppingCart.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)})
    @RequestMapping(value = "/shoppingCart",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    ResponseEntity<ShoppingCart> createShoppingCart(@ApiParam(value = "The Shopping Cart to be created", required = true) @Valid @RequestBody ShoppingCartCreate shoppingCart);


    @ApiOperation(value = "List or getAll 'ShoppingCart' objects", nickname = "listShoppingCart", notes = "", response = ShoppingCart.class, responseContainer = "List", tags = {"shoppingcart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok", response = ShoppingCart.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)})
    @RequestMapping(value = "/shoppingCart",
            produces = {"application/json"},
          //  consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<ShoppingCart>> listShoppingCart(@ApiParam(value = "Comma separated properties to display in response")
                                                        @Valid
                                                        @RequestParam(value = "fields", required = false)
                                                                String fields,
                                                        @ApiParam(value = "For filtering: An instant of time, ending at the TimePeriod.")
                                                        @Valid
                                                        @RequestParam(value = "validFor.endDateTime", required = false)
                                                                OffsetDateTime validForEndDateTime,
                                                        @ApiParam(value = "For filtering: An instant of time, starting at the TimePeriod")
                                                        @Valid
                                                        @RequestParam(value = "validFor.startDateTime", required = false)
                                                                OffsetDateTime validForStartDateTime,
                                                        @ApiParam(value = "For filtering: Author of the note")
                                                        @Valid
                                                        @RequestParam(value = "note.author", required = false)
                                                                String noteAuthor,
                                                        @ApiParam(value = "For filtering: Date of the note")
                                                        @Valid
                                                        @RequestParam(value = "note.date", required = false)
                                                                OffsetDateTime noteDate,
                                                        @ApiParam(value = "For filtering: Text of the note")
                                                        @Valid
                                                        @RequestParam(value = "note.text", required = false)
                                                                String noteText,
                                                        @ApiParam(value = "For filtering: If true, indicates that is the preferred contact medium")
                                                        @Valid
                                                        @RequestParam(value = "contactMedium.preferred", required = false)
                                                                Boolean contactMediumPreferred,
                                                        @ApiParam(value = "For filtering: Type of the contact medium, such as: email address, telephone number, postal address")
                                                        @Valid
                                                        @RequestParam(value = "contactMedium.type", required = false)
                                                                String contactMediumType,
                                                        @ApiParam(value = "For filtering: A short descriptive name such as \"Subscription price\".")
                                                        @Valid
                                                        @RequestParam(value = "cartTotalPrice.name", required = false)
                                                                String cartTotalPriceName,
                                                        @ApiParam(value = "For filtering: A category that describes the price, such as recurring, discount, allowance, penalty, and so forth")
                                                        @Valid
                                                        @RequestParam(value = "cartTotalPrice.priceType", required = false)
                                                                String cartTotalPricePriceType,
                                                        @ApiParam(value = "For filtering: Could be month, week...")
                                                        @Valid
                                                        @RequestParam(value = "cartTotalPrice.recurringChargePeriod", required = false)
                                                                String cartTotalPriceRecurringChargePeriod,
                                                        @ApiParam(value = "For filtering: Could be minutes, GB...")
                                                        @Valid
                                                        @RequestParam(value = "cartTotalPrice.unitOfMeasure", required = false)
                                                                String cartTotalPriceUnitOfMeasure,
                                                        @ApiParam(value = "For filtering: Can be \"add\" / \"modify\" / \"no_change\"/ \"delete\"")
                                                        @Valid
                                                        @RequestParam(value = "cartItem.action", required = false)
                                                                String cartItemAction,
                                                        @ApiParam(value = "For filtering: Quantity of cart items")
                                                        @Valid
                                                        @RequestParam(value = "cartItem.quantity", required = false)
                                                                Integer cartItemQuantity,
                                                        @ApiParam(value = "For filtering: status of cart item. e.g \"Active\" , \"SavedForLater\".")
                                                        @Valid
                                                        @RequestParam(value = "cartItem.status", required = false)
                                                                String cartItemStatus,
                                                        @ApiParam(value = "For filtering: Name of the related party")
                                                        @Valid
                                                        @RequestParam(value = "relatedParty.name", required = false)
                                                                String relatedPartyName,
                                                        @ApiParam(value = "For filtering: Role of the related party.")
                                                        @Valid
                                                        @RequestParam(value = "relatedParty.role", required = false)
                                                                String relatedPartyRole);


    @ApiOperation(value = "Retrieves a 'ShoppingCart' by Id", nickname = "retrieveShoppingCart", notes = "", response = ShoppingCart.class, responseContainer = "List", tags = {"shoppingcart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Ok", response = ShoppingCart.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 404, message = "Not Found", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)})
    @RequestMapping(value = "/shoppingCart/{id}",
            produces = {"application/json"},
          //  consumes = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<List<ShoppingCart>> retrieveShoppingCart(@ApiParam(value = "Identifier of the Shopping Cart", required = true) @PathVariable("id") String id);


    @ApiOperation(value = "Updates partially a 'ShoppingCart' by Id", nickname = "updateShoppingCart", notes = "", response = ShoppingCart.class, tags = {"shoppingcart",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Updated", response = ShoppingCart.class),
            @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
            @ApiResponse(code = 404, message = "Not Found", response = Error.class),
            @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class)})
    @RequestMapping(value = "/shoppingCart/{id}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PATCH)
    ResponseEntity<ShoppingCart> updateShoppingCart(@ApiParam(value = "Identifier of the Shopping Cart", required = true) @PathVariable("id") String id, @ApiParam(value = "The Shopping Cart to be updated", required = true) @Valid @RequestBody ShoppingCartUpdate shoppingCart);

}
