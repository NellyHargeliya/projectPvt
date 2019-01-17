package by.pvt.model.shoppingcart;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions Skipped properties: id,href
 */
@ApiModel(description = "Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions Skipped properties: id,href")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")

public class ShoppingCartCreate {
    @JsonProperty("href")
    @Valid
    private String href = null;

    @JsonProperty("validFor")
    private TimePeriod validFor = null;

    @JsonProperty("note")
    @Valid
    private List<Note> note = null;

    @JsonProperty("contactMedium")
    @Valid
    private List<ContactMedium> contactMedium = null;

    @JsonProperty("cartTotalPrice")
    @Valid
    private List<CartPrice> cartTotalPrice = null;

    @JsonProperty("cartItem")
    @Valid
    private List<CartItem> cartItem = new ArrayList<CartItem>();

    @JsonProperty("relatedParty")
    @Valid
    private List<RelatedPartyRef> relatedParty = null;

    public ShoppingCartCreate validFor(TimePeriod validFor) {
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

    public ShoppingCartCreate note(List<Note> note) {
        this.note = note;
        return this;
    }

    public ShoppingCartCreate addNoteItem(Note noteItem) {
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

    public ShoppingCartCreate contactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
        return this;
    }

    public ShoppingCartCreate addContactMediumItem(ContactMedium contactMediumItem) {
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

    public ShoppingCartCreate cartTotalPrice(List<CartPrice> cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
        return this;
    }

    public ShoppingCartCreate addCartTotalPriceItem(CartPrice cartTotalPriceItem) {
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

    public ShoppingCartCreate cartItem(List<CartItem> cartItem) {
        this.cartItem = cartItem;
        return this;
    }

    public ShoppingCartCreate addCartItemItem(CartItem cartItemItem) {
        this.cartItem.add(cartItemItem);
        return this;
    }

    /**
     * Get cartItem
     *
     * @return cartItem
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public List<CartItem> getCartItem() {
        return cartItem;
    }

    public void setCartItem(List<CartItem> cartItem) {
        this.cartItem = cartItem;
    }

    public ShoppingCartCreate relatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public ShoppingCartCreate addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
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
        ShoppingCartCreate shoppingCartCreate = (ShoppingCartCreate) o;
        return Objects.equals(this.validFor, shoppingCartCreate.validFor) &&
                Objects.equals(this.note, shoppingCartCreate.note) &&
                Objects.equals(this.contactMedium, shoppingCartCreate.contactMedium) &&
                Objects.equals(this.cartTotalPrice, shoppingCartCreate.cartTotalPrice) &&
                Objects.equals(this.cartItem, shoppingCartCreate.cartItem) &&
                Objects.equals(this.relatedParty, shoppingCartCreate.relatedParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(validFor, note, contactMedium, cartTotalPrice, cartItem, relatedParty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShoppingCartCreate {\n");

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

