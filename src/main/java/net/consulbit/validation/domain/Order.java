package net.consulbit.validation.domain;

import net.consulbit.validation.constraint.CreationOrderPhase;
import net.consulbit.validation.constraint.DeliveryOrderPhase;
import net.consulbit.validation.constraint.PaymentOrderPhase;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.List;

import javax.validation.constraints.Past;

/**
 * Created by Pietro Cascio on 27/01/2017.
 *
 * @author <a href="mailto:pietro.cascio@entropay.com">Pietro Cascio</a>
 */
public class Order {

    private int id;
    private List<Item> items;
    private LocalDate creationDate;
    private LocalDate paymentDate;
    private LocalDate deliveryDate;

    public Order(final int id, final List<Item> items, final LocalDate creationDate) {

        this.id = id;
        this.items = items;
        this.creationDate = creationDate;
    }

    public int getId() {

        return id;
    }

    public List<Item> getItems() {

        return items;
    }

    @Past(groups = {CreationOrderPhase.class, PaymentOrderPhase.class, DeliveryOrderPhase.class})
    public Instant getCreationDate() {

        return creationDate.atStartOfDay().toInstant(ZoneOffset.UTC);
    }

    @Past(groups = {PaymentOrderPhase.class, DeliveryOrderPhase.class})
    public Instant getPaymentDate() {

        return paymentDate.atStartOfDay().toInstant(ZoneOffset.UTC);
    }

    @Past(groups = DeliveryOrderPhase.class)
    public Instant getDeliveryDate() {

        return deliveryDate.atStartOfDay().toInstant(ZoneOffset.UTC);
    }

    public void setItems(final List<Item> items) {

        this.items = items;
    }

    public void setPaymentDate(final LocalDate paymentDate) {

        this.paymentDate = paymentDate;
    }

    public void setDeliveryDate(final LocalDate deliveryDate) {

        this.deliveryDate = deliveryDate;
    }
}
