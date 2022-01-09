package pattern.behavioral.visit.visitee;

import pattern.behavioral.visit.visitor.ShopItemVisitor;

public abstract class ShopItem {

    public abstract void accept(ShopItemVisitor visitor);

}
