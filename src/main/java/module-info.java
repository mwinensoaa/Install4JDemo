module com.demo.install4jdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;

    opens com.demo.install4jdemo to javafx.fxml;
    exports com.demo.install4jdemo;
    requires org.kordamp.ikonli.core;

}