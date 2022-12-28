package chapter5.resource_bundle;

import java.util.ListResourceBundle;

public class Zoo extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {
                    "name", "name_Zoo.class"
                }
        };
    }
}
