package chapter5.resource_bundle;

import java.util.ListResourceBundle;

public class Zoo_en_CA extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
                {
                    "visitor", "visitor_Zoo_en_CA.class"
                }
        };
    }
}
