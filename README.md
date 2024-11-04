# JavaFX Layouts: VBox, HBox, and StackPane

In JavaFX, `VBox`, `HBox`, and `StackPane` are types of layout panes that help organize UI components. Each has a unique way of arranging its child nodes.

## 1. VBox

- **Definition**: `VBox` (Vertical Box) arranges its child nodes in a single vertical column.
- **Usage**: It's useful for creating vertical layouts, such as a list of buttons or form fields stacked on top of each other.
- **Example**: Suppose you want a form with labels and text fields stacked vertically.

  ```java
  VBox vbox = new VBox();
  vbox.setSpacing(10);  // Set space between elements

  Label nameLabel = new Label("Name:");
  TextField nameField = new TextField();

  Label ageLabel = new Label("Age:");
  TextField ageField = new TextField();

  vbox.getChildren().addAll(nameLabel, nameField, ageLabel, ageField);
  ```

- **Spacing**: You can set the spacing between elements using `setSpacing()`.

## 2. HBox

- **Definition**: `HBox` (Horizontal Box) arranges its child nodes in a single horizontal row.
- **Usage**: Ideal for layouts where elements need to be placed side by side, such as a toolbar with buttons.
- **Example**: Suppose you want a toolbar with buttons arranged horizontally.

  ```java
  HBox hbox = new HBox();
  hbox.setSpacing(10);  // Set space between elements

  Button saveButton = new Button("Save");
  Button cancelButton = new Button("Cancel");

  hbox.getChildren().addAll(saveButton, cancelButton);
  ```

- **Alignment**: You can set the alignment of the elements within the `HBox`, for example, `hbox.setAlignment(Pos.CENTER);`.

## 3. StackPane

- **Definition**: `StackPane` stacks its child nodes on top of each other, with each new child node placed in the center of the pane by default.
- **Usage**: Useful for layering elements, such as placing a label on top of an image.
- **Example**: Suppose you want to place a label in the center of a background image.

  ```java
  StackPane stackPane = new StackPane();

  ImageView backgroundImage = new ImageView(new Image("background.jpg"));
  Label label = new Label("Hello World");

  stackPane.getChildren().addAll(backgroundImage, label);
  ```

- **Positioning**: You can adjust the position of each child node using `StackPane.setAlignment(child, Pos.TOP_LEFT);` (or other positions).

## Key Points

- `VBox` and `HBox` are suitable for arranging elements in a single row or column.
- `StackPane` is ideal for layering elements on top of each other, with control over alignment.
