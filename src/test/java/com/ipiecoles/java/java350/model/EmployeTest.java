package com.ipiecoles.java.java350.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeTest {

    @Test
    void testGetNombreAnneeAncienneteDtEmbaucheNull() {
        // Given
        Employe employe = new Employe();
        employe.setDateEmbauche(null);
        // When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        // Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(0);
    }

    @Test
    void testGetNombreAnneeAncienneteDtEmbauchePlus2Ans() {
        // Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().plusYears(2));
        // When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        // Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(0);
    }

    @Test
    void testGetNombreAncienneteDtEmbaucheMoins3Ans() {
        // Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now().minusYears(3));
        // When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        // Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(3);
    }

    @Test
    void testGetNombreAncienneteDtEmbaucheNow() {
        // Given
        Employe employe = new Employe();
        employe.setDateEmbauche(LocalDate.now());
        // When
        Integer nbAnneeAnciennete = employe.getNombreAnneeAnciennete();
        // Then
        Assertions.assertThat(nbAnneeAnciennete).isEqualTo(0);
    }
}