package com.swtestacademy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {

    Risk risk();

    public enum Risk {
        HIGH("High"), MEDIUM("Medium"),LOW("Low");
        public final String type;

        private Risk(String type) {
            this.type = type;
        }

        public final String getType() {
            return type;
        }

        public static Risk getType(String type) {
            if (type == HIGH.getType()) {
                return HIGH;
            } else if (type == MEDIUM.getType()) {
                return MEDIUM;
            } else
                return LOW;
        }
    }
}
