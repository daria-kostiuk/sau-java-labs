module edu.ntudp.sau.dkostiukjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires junit;


    opens edu.ntudp.sau.dkostiukjava to javafx.fxml;
    exports edu.ntudp.sau.dkostiukjava;
}