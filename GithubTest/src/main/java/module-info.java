module com.bas.githubtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bas.githubtest to javafx.fxml;
    exports com.bas.githubtest;
}