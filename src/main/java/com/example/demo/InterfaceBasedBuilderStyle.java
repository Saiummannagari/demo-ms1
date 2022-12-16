package com.example.demo;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.PACKAGE, ElementType.TYPE })
@Retention(RetentionPolicy.CLASS)
@Value.Style(
        get = { "is*", "get*" },                      // Detect 'get' and 'is' prefixes in accessor methods
        init = "with*",                               // Builder initialization methods will have 'with' prefix
        typeImmutable = "Immutable*",                 // 'Immutable' prefix will be added to the generated class
        optionalAcceptNullable = true,                // For optional fields, withX(null) will be treated as empty
        jdkOnly = true,                               // Generated code will use only JDK 7+ standard library classes
        visibility = Value.Style.ImplementationVisibility.PUBLIC) // Generated class will be always public
public @interface InterfaceBasedBuilderStyle {
}
