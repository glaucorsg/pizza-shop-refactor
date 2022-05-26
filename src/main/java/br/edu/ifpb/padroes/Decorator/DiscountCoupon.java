package br.edu.ifpb.padroes.Decorator;

public class DiscountCoupon extends DataPizzaExtraDecorator{

    public DiscountCoupon(PizzaExtra pizza){
        super(pizza);
    }
    @Override
    public Float totalPrice(Float valor) {
        return super.totalPrice(valor *= 0.25f);
    }

    @Override
    public String name(String name) {
        return super.name(name);
    }
}
