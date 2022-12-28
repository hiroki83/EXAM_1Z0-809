package chapter5.resource_bundle;

import java.util.ListResourceBundle;

public class Zoo_fr_FR extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {
                "zoo", "fr_FR zoo"
            },
            {
                "name", "Vancouver Zoo"
            },
                {
                        "test2", "fr"
                },
                {
                    "open_Zoo_fr_FR.class", "open_Zoo_fr_FR.class"
                }
        };
    }
}
