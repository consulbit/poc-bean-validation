package net.consulbit.validation.domain;

import java.math.BigDecimal;

/**
 * Created by Pietro Cascio on 27/01/2017.
 *
 * @author <a href="mailto:pietro.cascio@entropay.com">Pietro Cascio</a>
 */
public class Item {

    private int id;
    private String name;
    private String description;
    private BigDecimal price;

    public Item(final int id, final String name, final BigDecimal price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Item(final int id, final String name, final String description, final BigDecimal price) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {

        return description;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public void setName(final String name) {

        this.name = name;
    }

    public void setDescription(final String description) {

        this.description = description;
    }

    public void setPrice(final BigDecimal price) {

        this.price = price;
    }
}
