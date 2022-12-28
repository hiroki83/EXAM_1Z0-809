package chapter5;

import java.util.ListResourceBundle;

public class Zoo extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][] { { "hello", "Hello" },
                { "a", "c" }
        };
    }
}
