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
import java.util.Objects;

/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.
 */
@ApiModel(description = "Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class Price {
    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
  private String id = null;


    @JsonProperty("dutyFreeAmount")
    @OneToOne(cascade = CascadeType.ALL)
    private Money dutyFreeAmount = null;

    @JsonProperty("percentage")
    @Column
    private Float percentage = null;

    @JsonProperty("taxIncludedAmount")
    @OneToOne(cascade = CascadeType.ALL)
    private Money taxIncludedAmount = null;

    @JsonProperty("taxRate")
    @Column
    private Float taxRate = null;

    public Price dutyFreeAmount(Money dutyFreeAmount) {
        this.dutyFreeAmount = dutyFreeAmount;
        return this;
    }

    /**
     * All taxes excluded amount (expressed in the given currency)
     *
     * @return dutyFreeAmount
     **/
    @ApiModelProperty(value = "All taxes excluded amount (expressed in the given currency)")

    @Valid

    public Money getDutyFreeAmount() {
        return dutyFreeAmount;
    }

    public void setDutyFreeAmount(Money dutyFreeAmount) {
        this.dutyFreeAmount = dutyFreeAmount;
    }

    public Price percentage(Float percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Percentage to apply for ProdOfferPriceAlteration
     *
     * @return percentage
     **/
    @ApiModelProperty(value = "Percentage to apply for ProdOfferPriceAlteration")


    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public Price taxIncludedAmount(Money taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * All taxes included amount (expressed in the given currency)
     *
     * @return taxIncludedAmount
     **/
    @ApiModelProperty(value = "All taxes included amount (expressed in the given currency)")

    @Valid

    public Money getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    public void setTaxIncludedAmount(Money taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }

    public Price taxRate(Float taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * Tax rate
     *
     * @return taxRate
     **/
    @ApiModelProperty(value = "Tax rate")


    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Price price = (Price) o;
        return Objects.equals(this.dutyFreeAmount, price.dutyFreeAmount) &&
                Objects.equals(this.percentage, price.percentage) &&
                Objects.equals(this.taxIncludedAmount, price.taxIncludedAmount) &&
                Objects.equals(this.taxRate, price.taxRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dutyFreeAmount, percentage, taxIncludedAmount, taxRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Price {\n");

        sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
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

