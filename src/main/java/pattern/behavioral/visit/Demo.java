package pattern.behavioral.visit;


import pattern.behavioral.visit.visitee.ConcreteShopItem1;
import pattern.behavioral.visit.visitee.ConcreteShopItem2;
import pattern.behavioral.visit.visitor.Buyer;
import pattern.behavioral.visit.visitor.Renter;
import pattern.behavioral.visit.visitor.Seller;
import pattern.behavioral.visit.visitor.ShopItemVisitor;

public class Demo {

    public static void main(String args[]){

        ShopItemVisitor visitor = new Buyer();
        new ConcreteShopItem1().accept(visitor);
        new ConcreteShopItem2().accept(visitor);

        ShopItemVisitor renter = new Renter();
        new ConcreteShopItem1().accept(renter);
        new ConcreteShopItem2().accept(renter);

        ShopItemVisitor seller = new Seller();
        new ConcreteShopItem1().accept(seller);
        new ConcreteShopItem2().accept(seller);
    }

}
