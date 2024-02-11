package com.yaya.service.dto;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.yaya.domain.Student} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class StudentDTO implements Serializable {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StudentDTO)) {
            return false;
        }

        StudentDTO studentDTO = (StudentDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, studentDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "StudentDTO{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", grade='" + getGrade() + "'" +
            "}";
    }
}
