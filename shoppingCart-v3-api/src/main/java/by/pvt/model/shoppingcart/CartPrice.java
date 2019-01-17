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
 * An amount, usually of money, that represents the actual price paid by the customer for this item. May represent the total price of the shopping cart or the total of the cart item depending on the relation
 */
@ApiModel(description = "An amount, usually of money, that represents the actual price paid by the customer for this item. May represent the total price of the shopping cart or the total of the cart item depending on the relation")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class CartPrice {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column
    private String id = null;

    @JsonProperty("description")
    @Column
    private String description = null;

    @JsonProperty("name")
    @Column
    private String name = null;

    @JsonProperty("priceType")
    @Column
    private String priceType = null;

    @JsonProperty("recurringChargePeriod")
    @Column
    private String recurringChargePeriod = null;

    @JsonProperty("unitOfMeasure")
    @Column
    private String unitOfMeasure = null;

    @JsonProperty("price")
    @OneToOne(cascade = CascadeType.ALL)
    private Price price = null;

    @JsonProperty("priceAlteration")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<PriceAlteration> priceAlteration = null;

    public CartPrice description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A narrative that explains in detail the semantics of this order item price.
     *
     * @return description
     **/
    @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price.")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CartPrice name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A short descriptive name such as \"Subscription price\".
     *
     * @return name
     **/
    @ApiModelProperty(value = "A short descriptive name such as \"Subscription price\".")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CartPrice priceType(String priceType) {
        this.priceType = priceType;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A category that describes the price, such as recurring, discount, allowance, penalty, and so forth
     *
     * @return priceType
     **/
    @ApiModelProperty(value = "A category that describes the price, such as recurring, discount, allowance, penalty, and so forth")


    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public CartPrice recurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
        return this;
    }

    /**
     * Could be month, week...
     *
     * @return recurringChargePeriod
     **/
    @ApiModelProperty(value = "Could be month, week...")


    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    public void setRecurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
    }

    public CartPrice unitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * Could be minutes, GB...
     *
     * @return unitOfMeasure
     **/
    @ApiModelProperty(value = "Could be minutes, GB...")


    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public CartPrice price(Price price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public CartPrice priceAlteration(List<PriceAlteration> priceAlteration) {
        this.priceAlteration = priceAlteration;
        return this;
    }

    public CartPrice addPriceAlterationItem(PriceAlteration priceAlterationItem) {
        if (this.priceAlteration == null) {
            this.priceAlteration = new ArrayList<PriceAlteration>();
        }
        this.priceAlteration.add(priceAlterationItem);
        return this;
    }

    /**
     * Get priceAlteration
     *
     * @return priceAlteration
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<PriceAlteration> getPriceAlteration() {
        return priceAlteration;
    }

    public void setPriceAlteration(List<PriceAlteration> priceAlteration) {
        this.priceAlteration = priceAlteration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CartPrice cartPrice = (CartPrice) o;
        return Objects.equals(this.description, cartPrice.description) &&
                Objects.equals(this.name, cartPrice.name) &&
                Objects.equals(this.priceType, cartPrice.priceType) &&
                Objects.equals(this.recurringChargePeriod, cartPrice.recurringChargePeriod) &&
                Objects.equals(this.unitOfMeasure, cartPrice.unitOfMeasure) &&
                Objects.equals(this.price, cartPrice.price) &&
                Objects.equals(this.priceAlteration, cartPrice.priceAlteration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, priceType, recurringChargePeriod, unitOfMeasure, price, priceAlteration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CartPrice {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
        sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
        sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    priceAlteration: ").append(toIndentedString(priceAlteration)).append("\n");
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

