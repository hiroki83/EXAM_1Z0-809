package chapter5.resource_bundle;

import java.util.ListResourceBundle;

public class Zoo_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {
                "zoo", "en_US zoo"
            },
            {
                "name", "Sant Zoo"
            },
                {
                        "test3", "en"
                },
                {
                    "open_Zoo_en_US.class", "open_Zoo_en_US.class"
                }
        };
    }
}
