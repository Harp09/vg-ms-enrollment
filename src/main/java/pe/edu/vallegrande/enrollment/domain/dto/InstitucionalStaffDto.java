package pe.edu.vallegrande.enrollment.domain.dto;

import lombok.Data;

@Data
public class InstitucionalStaffDto {
    private String id_institucional_staff;
    private String name;
    private String document_number;
    private String email;
    private String phone;
    private String occupation;
    private String state;
}
