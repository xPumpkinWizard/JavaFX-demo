package com.example.javafxdemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class SceneController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Boolean[] myArrayEquipments = new Boolean[5];

    @FXML
    private ToggleButton benchTb;

    @FXML
    private ToggleButton chestPressTb;
    @FXML
    private ToggleButton latPullTb;

    @FXML
    private ToggleButton ropeTb;

    @FXML
    private ToggleButton treadTb;

    @FXML
    private ToggleButton weightsTb;

    @FXML
    void toggleButton(ActionEvent event) {
        if (event.getSource() == chestPressTb) {
            System.out.println("one-one");
        }
        if(event.getSource() == latPullTb){
            System.out.println("one");

        }
        if(event.getSource() == weightsTb){
            System.out.println("two");

        }
        if (event.getSource() == ropeTb){
            System.out.println("three");

        }
        if (event.getSource() == treadTb) {
            System.out.println("four");

        }
        if (event.getSource() == benchTb){
            System.out.println("five");

        }
    }
    @FXML
    private CheckBox arms;
    @FXML
    private CheckBox back;
    @FXML
    private CheckBox body;
    @FXML
    private CheckBox cardio;
    @FXML
    private CheckBox chest;
    @FXML
    private CheckBox core;
    @FXML
    private CheckBox legs;
    @FXML
    private CheckBox shoulder;
    @FXML
    public void tbMucles(ActionEvent event) {
        CheckBox[] checkboxes = {core, legs, back, arms, chest, shoulder, body, cardio};
        for (CheckBox checkbox : checkboxes) {
            if (checkbox.isSelected()) {
                checkbox.setStyle("-fx-background-color: red;");
            } else {
                checkbox.setStyle(null);
            }
        }
    }

    @FXML
    public void switchToScene1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void switchToScene2(ActionEvent event) throws IOException {
        System.out.println("switchToScene2");
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        ImageView imageView = new ImageView();
        Image image1 = new Image("chest-press.png");
        imageView.setImage(image1);
        Image image2 = new Image("fitness.png");
        imageView.setImage(image2);
        Image image3 = new Image("kettlebell.png");
        imageView.setImage(image3);
        Image image4 = new Image("skipping-rope.png");
        imageView.setImage(image4);
        Image image5 = new Image("treadmill.png");
        imageView.setImage(image5);
        Image image6 = new Image("weight-lifting.png");
        imageView.setImage(image6);

        ImageView imageNew = new ImageView();
        Image imageCore = new Image("abs.png");
        imageNew.setImage(imageCore);
        Image imageLegs = new Image("quadricep.png");
        imageNew.setImage(imageLegs);
        Image imageBack = new Image("back.png");
        imageNew.setImage(imageBack);
        Image imageArms = new Image("muscle.png");
        imageNew.setImage(imageArms);
        Image imageChest = new Image("body.png");
        imageNew.setImage(imageChest);
        Image imageShoulder = new Image("shoulder.png");
        imageNew.setImage(imageShoulder);
        Image imageBody = new Image("user.png");
        imageNew.setImage(imageBody);
        Image imageCardio = new Image("running-man.png");
        imageNew.setImage(imageCardio);

        stage.show();
    }

    @FXML
    public void switchToScene3(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        setTextToExercise1();
        stage.show();

    }
    public void setTextToExercise1() {
        ImageView imageDisplay = new ImageView();
        String[] exercises = {"Bench Press", "Kettlebell Swing", "Dumbbell Curl", "Jump Rope", "Treadmill Run", "Chest Press", "Lat Pulldown", "Deadlift", "Shoulder Press", "Plank Hold", "Squat Jump", "Push-up", "Mountain Climber", "Russian Twist"};
        String[] pictures = {"benchPress.png", "kettlebellSwing.png", "bicepscurl.png", "skippingrope.png", "gymtread.png", "chest-press.png", "fitness.png", "weight_lifting.png", "shoulderPress.png", "squat.png" ,"plank.png", "pushups.png", "mount.png", "yoga-pose.png"};

        String[] exercisesData = {  "Bench Press: Lie flat on your back\n on a bench and lift a barbell from \na rack with your arms extended. Lower\n the bar down to your chest and then push it back up.",
                                    "Kettlebell Swing: Hold a kettlebell\n with both hands, hinge at the hips \nand swing the kettlebell up to shoulder\n level. Control the swing on the way back down.",
                                    "Dumbbell Curl: Hold a dumbbell in each\n hand with palms facing forward.\n Curl the weights up towards your shoulders\n and then lower them back down.",
                                    "Jump Rope: Jump over a rope that is \nswung under your feet. Keep your vfeet together and your body upright.",
                                    "Treadmill Run: Run on a motorized \ntreadmill at a pace that challenges \nyou.",
                                    "Chest Press: Lie on your back on a \nbench and lift two dumbbells from \na rack with your arms extended. Lower the \ndumbbells down to your chest and then push them back up.",
                                    "Lat Pulldown: Sit at a pulldown machine\n and grab the bar with a wide \ngrip. Pull the bar down to your chest and \nthen slowly release it back up.",
                                    "Deadlift: Stand with your feet \nshoulder-width apart and lift a barbell\n from the ground up to your hips. Keep \nyour back straight and engage your core.",
                                    "Shoulder Press: Stand with a \ndumbbell in each hand at shoulder height. \nPush the weights up above your head and\n then lower them back down.",
                                    "Plank Hold: Get into a push-up \nposition and lower yourself onto your \nforearms. Hold this position with your body\n in a straight line.",
                                    "Squat Jump: Stand with your feet \nshoulder-width apart and lower \nyourself into a squat. Jump up explosively and \nthen land softly back in the squat position.",
                                    "Push-up: Get into a push-up position with\n your hands shoulder-width\n apart. Lower yourself down until your chest\n touches the ground and then push yourself back up.",
                                    "Mountain Climber: Get into a push-up \nposition with your hands shoulder-width\n apart. Bring your knees in towards \nyour chest one at a time in a running motion.",
                                    "Russian Twist: Sit on the ground with \nyour feet lifted off the floor and \nyour knees bent. Twist your torso from \nside to side while holding a weight or medicine ball."};

        List<String> selectedExercises = new ArrayList<>();
        List<String> selectedDescriptions = new ArrayList<>();
        int numSelections = 5;
        int numExercises = exercises.length;
        int i = 0;

        while (selectedExercises.size() < numSelections && selectedDescriptions.size() < numSelections) {
            int randIndex = (int) (Math.random() * numExercises);
            String exercise = exercises[randIndex];
            String description = exercisesData[randIndex];
            if (!selectedExercises.contains(exercise) && !selectedDescriptions.contains(description)) {
                selectedExercises.add(exercise);
                selectedDescriptions.add(description);
                i++;
            }
        }

        Label exercise1 = (Label) scene.lookup("#exercise1");
        exercise1.setText(selectedExercises.get(0));
        Label d1 = (Label) scene.lookup("#d1");
        d1.setText(selectedDescriptions.get(0));

        Label exercise2 = (Label) scene.lookup("#exercise2");
        exercise2.setText(selectedExercises.get(1));
        Label d2 = (Label) scene.lookup("#d2");
        d2.setText(selectedDescriptions.get(1));

        Label exercise3 = (Label) scene.lookup("#exercise3");
        exercise3.setText(selectedExercises.get(2));
        Label d3 = (Label) scene.lookup("#d3");
        d3.setText(selectedDescriptions.get(2));

        Label exercise4 = (Label) scene.lookup("#exercise4");
        exercise4.setText(selectedExercises.get(3));
        Label d4 = (Label) scene.lookup("#d4");
        d4.setText(selectedDescriptions.get(3));

        Label exercise5 = (Label) scene.lookup("#exercise5");
        exercise5.setText(selectedExercises.get(4));
        Label d5 = (Label) scene.lookup("#d5");
        d5.setText(selectedDescriptions.get(4));


//
//        ImageView image1 = (ImageView) scene.lookup("#image1");
//        image1.setImage(new Image(getClass().getResourceAsStream(selectedPictures.get(0))));
//
//        ImageView image2 = (ImageView) scene.lookup("#image2");
//        image2.setImage(new Image(getClass().getResourceAsStream(selectedPictures.get(1))));
//
//        ImageView image3 = (ImageView) scene.lookup("#image3");
//        image3.setImage(new Image(getClass().getResourceAsStream(selectedPictures.get(2))));
//
//        ImageView image4 = (ImageView) scene.lookup("#image4");
//        image4.setImage(new Image(getClass().getResourceAsStream(selectedPictures.get(3))));
//
//        ImageView image5 = (ImageView) scene.lookup("#image5");
//        image5.setImage(new Image(getClass().getResourceAsStream(selectedPictures.get(4))));

    }




}

