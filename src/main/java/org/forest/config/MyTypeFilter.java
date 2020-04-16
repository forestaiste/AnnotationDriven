package org.forest.config;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();

        System.out.println("--->" + className);

        if (className.contains("er")) {return true;}

        return false;
    }
}
