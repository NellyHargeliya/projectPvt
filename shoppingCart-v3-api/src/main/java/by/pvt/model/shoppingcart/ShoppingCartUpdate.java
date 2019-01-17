package by.pvt.model.shoppingcart;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions Skipped properties: id,href,id,href,validFor,cartTotalPrice
 */
@ApiModel(description = "Shopping Cart resource is used for the temporarily selection and reservation of product offerings in e-commerce, call center and retail purchase. Shopping cart supports purchase of both physical and digital goods and service (e.g. handset, telecom network service). Shopping Cart contain list of cart items, a reference to customer (partyRole) or contact medium in case customer not exist, and the total items price including promotions Skipped properties: id,href,id,href,validFor,cartTotalPrice")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")

public class ShoppingCartUpdate {
    @JsonProperty("note")
    @Valid
    private List<Note> note = null;

    @JsonProperty("contactMedium")
    @Valid
    private List<ContactMedium> contactMedium = null;

    @JsonProperty("cartItem")
    @Valid
    private List<CartItem> cartItem = null;

    @JsonProperty("relatedParty")
    @Valid
    private List<RelatedPartyRef> relatedParty = null;

    public ShoppingCartUpdate note(List<Note> note) {
        this.note = note;
        return this;
    }

    public ShoppingCartUpdate addNoteItem(Note noteItem) {
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

    public ShoppingCartUpdate contactMedium(List<ContactMedium> contactMedium) {
        this.contactMedium = contactMedium;
        return this;
    }

    public ShoppingCartUpdate addContactMediumItem(ContactMedium contactMediumItem) {
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

    public ShoppingCartUpdate cartItem(List<CartItem> cartItem) {
        this.cartItem = cartItem;
        return this;
    }

    public ShoppingCartUpdate addCartItemItem(CartItem cartItemItem) {
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

    public ShoppingCartUpdate relatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public ShoppingCartUpdate addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
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
        ShoppingCartUpdate shoppingCartUpdate = (ShoppingCartUpdate) o;
        return Objects.equals(this.note, shoppingCartUpdate.note) &&
                Objects.equals(this.contactMedium, shoppingCartUpdate.contactMedium) &&
                Objects.equals(this.cartItem, shoppingCartUpdate.cartItem) &&
                Objects.equals(this.relatedParty, shoppingCartUpdate.relatedParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note, contactMedium, cartItem, relatedParty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShoppingCartUpdate {\n");

        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
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

