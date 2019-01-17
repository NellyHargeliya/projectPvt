package by.pvt.model.shoppingcart;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

/**
 * Product specification reference: A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.
 */
@ApiModel(description = "Product specification reference: A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class ProductSpecificationRef   {
    @JsonProperty("href")
    @Column
    private String href = null;

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id = null;

    @JsonProperty("name")
    @Column
    private String name = null;

    @JsonProperty("version")
    @Column
    private String version = null;


    public ProductSpecificationRef href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Reference of the product specification
     *
     * @return href
     **/
    @ApiModelProperty(value = "Reference of the product specification")


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ProductSpecificationRef id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the product specification
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier of the product specification")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductSpecificationRef name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the product specification
     *
     * @return name
     **/
    @ApiModelProperty(value = "Name of the product specification")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductSpecificationRef version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Version of the product specification
     *
     * @return version
     **/
    @ApiModelProperty(value = "Version of the product specification")


    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductSpecificationRef productSpecificationRef = (ProductSpecificationRef) o;
        return Objects.equals(this.href, productSpecificationRef.href) &&
                Objects.equals(this.id, productSpecificationRef.id) &&
                Objects.equals(this.name, productSpecificationRef.name) &&
                Objects.equals(this.version, productSpecificationRef.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, name, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductSpecificationRef {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

