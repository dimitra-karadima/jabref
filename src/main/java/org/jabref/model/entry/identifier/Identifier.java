package org.jabref.model.entry.identifier;

import java.net.URI;
import java.util.Optional;

import org.jabref.model.entry.field.Field;

public interface Identifier {

    Field getDefaultField();

    String getNormalized();

    Optional<URI> getExternalURI();
}
