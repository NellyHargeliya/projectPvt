package by.pvt.model.shoppingcart;

import by.pvt.model.BasePojo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.OffsetDateTime;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Extra information about the ticket or a product order
 */
@ApiModel(description = "Extra information about the ticket or a product order")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class Note {
    @JsonProperty("id")
    @Id
    @Valid
    @Column(unique = true)
    private String id = null;


    @JsonProperty("author")
    @Column
    private String author = null;

    @JsonProperty("date")
    @Column
    private OffsetDateTime date = null;

    @JsonProperty("text")
    @Column
    private String text = null;

    public Note author(String author) {
        this.author = author;
        return this;
    }

    /**
     * Author of the note
     *
     * @return author
     **/
    @ApiModelProperty(value = "Author of the note")

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Note date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Date of the note
     *
     * @return date
     **/
    @ApiModelProperty(value = "Date of the note")

    @Valid

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public Note text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Text of the note
     *
     * @return text
     **/
    @ApiModelProperty(value = "Text of the note")


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Note note = (Note) o;
        return Objects.equals(this.author, note.author) &&
                Objects.equals(this.date, note.date) &&
                Objects.equals(this.text, note.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, date, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Note {\n");

        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}

