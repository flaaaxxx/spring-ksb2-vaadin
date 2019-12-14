package pl.flaaaxxx.springksb2vaadin.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import pl.flaaaxxx.springksb2vaadin.manager.CarManager;
import pl.flaaaxxx.springksb2vaadin.model.Car;

@Route("car-add")
public class CarAdderGui extends VerticalLayout {

    private CarManager carManager;

    @Autowired
    public CarAdderGui(CarManager carManager) {
        this.carManager = carManager;

        TextField textFieldMark = new TextField();
        textFieldMark.setLabel("Mark");
        TextField textFieldModel = new TextField("Model");

        Button buttonAdd = new Button("Add car");

        buttonAdd.addClickListener(clickEvent -> {
            Car car = new Car(textFieldMark.getValue(), textFieldModel.getValue());
            carManager.addCar(car);

            carManager.getCarList().forEach(System.out::println);
        });

        add(textFieldMark, textFieldModel, buttonAdd);
    }
}
