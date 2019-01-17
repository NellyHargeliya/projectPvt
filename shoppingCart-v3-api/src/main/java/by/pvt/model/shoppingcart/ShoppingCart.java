package by.pvt.model.shoppingcart;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions
 */
@ApiModel(description = "Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class ShoppingCart {
    @JsonProperty("href")
    @Column
    private String href = null;

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id = null;

    @JsonProperty("validFor")
    @Embedded
    private TimePeriod validFor = null;

    @JsonProperty("note")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Note> note = null;

    @JsonProperty("contactMedium")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<ContactMedium> contactMedium = null;

    @JsonProperty("cartTotalPrice")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<CartPrice> cartTotalPrice = null;

    @JsonProperty("cartItem")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<CartItem> cartItem = null;

    @JsonProperty("relatedParty")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RelatedPartyRef> relatedParty = null;

    public ShoppingCart href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Hyperlink to access the shopping cart
     *
     * @return href
     **/
    @ApiModelProperty(value = "Hyperlink to access the shopping cart")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ShoppingCart id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier created on provider side (e.g. Order Capture system)
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier created on provider side (e.g. Order Capture system)")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShoppingCart validFor(TimePeriod validFor) {
        this.validFor = validFor;
        return this;
    }

    /**
     * The period for which the shopping cart is valid (e.g. 90 if no activity or 7 days if cart is empty)
     *
     * @return validFor
     **/
    @ApiModelProperty(value = "The period for which the shopping cart is valid (e.g. 90 if no activity or 7 days if cart is empty)")
    @Valid
    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public ShoppingCart note(List<Note> note) {
        this.note = note;
        return this;
    }

    public ShoppingCart addNoteItem(Note noteItem) {
        if (this.note == null) {
            this.note = new ArrayList<Note>();
        }
        this.note.add(noteItem);
        return this;
    }

    /**
     * Get note
     *
     * @return note
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<Note> getNote() {
        return note;
    }

    public void setNote(List<Note> note) {
        this.note = note;
    }

    public ShoppingCart contactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
        return this;
    }

    public ShoppingCart addContactMediumItem(ContactMedium contactMediumItem) {
        if (this.contactMedium == null) {
            this.contactMedium = new ArrayList<ContactMedium>();
        }
        this.contactMedium.add(contactMediumItem);
        return this;
    }

    /**
     * Get contactMedium
     *
     * @return contactMedium
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<ContactMedium> getContactMedium() {
        return contactMedium;
    }

    public void setContactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
    }

    public ShoppingCart cartTotalPrice(List<CartPrice> cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
        return this;
    }

    public ShoppingCart addCartTotalPriceItem(CartPrice cartTotalPriceItem) {
        if (this.cartTotalPrice == null) {
            this.cartTotalPrice = new ArrayList<CartPrice>();
        }
        this.cartTotalPrice.add(cartTotalPriceItem);
        return this;
    }

    /**
     * Get cartTotalPrice
     *
     * @return cartTotalPrice
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<CartPrice> getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(List<CartPrice> cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public ShoppingCart cartItem(List<CartItem> cartItem) {
        this.cartItem = cartItem;
        return this;
    }

    public ShoppingCart addCartItemItem(CartItem cartItemItem) {
        if (this.cartItem == null) {
            this.cartItem = new ArrayList<CartItem>();
        }
        this.cartItem.add(cartItemItem);
        return this;
    }

    /**
     * Get cartItem
     *
     * @return cartItem
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<CartItem> getCartItem() {
        return cartItem;
    }

    public void setCartItem(List<CartItem> cartItem) {
        this.cartItem = cartItem;
    }

    public ShoppingCart relatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public ShoppingCart addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
        if (this.relatedParty == null) {
            this.relatedParty = new ArrayList<RelatedPartyRef>();
        }
        this.relatedParty.add(relatedPartyItem);
        return this;
    }

    /**
     * Get relatedParty
     *
     * @return relatedParty
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<RelatedPartyRef> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShoppingCart shoppingCart = (ShoppingCart) o;
        return Objects.equals(this.href, shoppingCart.href) &&
                Objects.equals(this.id, shoppingCart.id) &&
                Objects.equals(this.validFor, shoppingCart.validFor) &&
                Objects.equals(this.note, shoppingCart.note) &&
                Objects.equals(this.contactMedium, shoppingCart.contactMedium) &&
                Objects.equals(this.cartTotalPrice, shoppingCart.cartTotalPrice) &&
                Objects.equals(this.cartItem, shoppingCart.cartItem) &&
                Objects.equals(this.relatedParty, shoppingCart.relatedParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, validFor, note, contactMedium, cartTotalPrice, cartItem, relatedParty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShoppingCart {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
        sb.append("    cartTotalPrice: ").append(toIndentedString(cartTotalPrice)).append("\n");
        sb.append("    cartItem: ").append(toIndentedString(cartItem)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

