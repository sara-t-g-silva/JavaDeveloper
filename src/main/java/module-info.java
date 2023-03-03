module com.dio.projetos.contabanco {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dio.projetos.contabanco to javafx.fxml;
    exports com.dio.projetos.contabanco;
}