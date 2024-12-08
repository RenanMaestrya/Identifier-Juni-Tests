package com.renan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IdentifierTest {

    @Test
    void testValidIdentifier() {
        Identifier identifier = new Identifier();
        assertTrue(identifier.validateIdentifier("abc123"), "Deve ser válido.");
        assertTrue(identifier.validateIdentifier("A"), "Deve ser válido.");
    }

    @Test
    void testInvalidIdentifier() {
        Identifier identifier = new Identifier();
        assertFalse(identifier.validateIdentifier(""), "Não pode ser vazio.");
        assertFalse(identifier.validateIdentifier("abcdefg"), "Excede o tamanho permitido.");
    }
}
