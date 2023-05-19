package net.runelite.rsb.query.request;

import net.runelite.rsb.wrappers.RSGroundItem;

import java.util.List;

import static net.runelite.rsb.methods.MethodProvider.methods;

public class RSGroundItemQueryRequest extends PositionableQueryRequest<RSGroundItem> {
    public RSGroundItemQueryRequest() {
        super(52);
    }

    public List request() {
        return List.of(methods.groundItems.getAll());
    }
}
