package com.gridcrud.views;

import com.gridcrud.backend.Student;
import com.gridcrud.backend.StudentService;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.CrudListener;
import org.vaadin.crudui.crud.impl.GridCrud;

import java.util.Collection;

@Route("")
public class ListView extends VerticalLayout {

    public ListView(StudentService service) {

        GridCrud<Student> crud = new GridCrud<>(Student.class);


        crud.setCrudListener(new CrudListener<Student>() {
            @Override
            public Collection<Student> findAll() {
                return service.findAll();
            }

            @Override
            public Student add(Student student) {
                return service.add(student);
            }

            @Override
            public Student update(Student student) {
                return service.update(student);
            }

            @Override
            public void delete(Student student) {
                service.delete(student);
            }
        });

        add(new H1("Student List"),crud);
    }
}
