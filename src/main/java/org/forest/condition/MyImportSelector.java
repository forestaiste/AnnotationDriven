package org.forest.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {"org.forest.models.Blue", "org.forest.models.Yellow", "org.forest.models.Red"};
    }
}
