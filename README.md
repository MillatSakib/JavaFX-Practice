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

# JavaFX Layout Panes: AnchorPane and BorderPane

In JavaFX, `AnchorPane` and `BorderPane` are two distinct types of layout panes, each with unique ways of positioning and organizing child nodes (like labels, buttons, and other controls) within the user interface.

## 4. AnchorPane

An `AnchorPane` is a flexible layout pane that allows you to "anchor" nodes to its edges. This means you can specify how far each side of a child node should be from the top, right, bottom, or left edge of the `AnchorPane`. It’s useful when you want precise control over the positioning of each child within the layout.

### Key Features:

- **Anchor Points**: You can set specific anchor points for a node. For example, if you anchor a node to the top and left edges, it will stay a fixed distance from those edges, even when the window is resized.
- **Independent Positioning**: You can anchor different nodes in various ways (top-left, bottom-right, center, etc.), giving you flexible control over positioning.

### Example of Usage

```java
AnchorPane anchorPane = new AnchorPane();
Label label = new Label("Hello, AnchorPane!");

// Anchor the label 10 pixels from the top and left edges
AnchorPane.setTopAnchor(label, 10.0);
AnchorPane.setLeftAnchor(label, 10.0);

anchorPane.getChildren().add(label);
```

In this example:

- The `label` is anchored 10 pixels from the top and left edges of the `AnchorPane`.
- If the `AnchorPane` resizes, the `label` will maintain this 10-pixel distance.

You can also anchor a node to multiple edges (e.g., top and bottom) to stretch it.

## 5. BorderPane

A `BorderPane` is a structured layout pane that divides the available space into five distinct regions:

- **Top**
- **Bottom**
- **Left**
- **Right**
- **Center**

Each of these regions can hold one node, and they’re organized as follows:

- The **Center** region expands to fill any remaining space, while the other regions (Top, Bottom, Left, Right) adjust to fit their content and stay attached to their specified borders.

### Key Features:

- **Fixed Regions**: Ideal for layouts that need a header (Top), footer (Bottom), sidebar (Left or Right), and a main content area (Center).
- **Dynamic Resizing**: As the `BorderPane` resizes, the Center region expands or contracts to fit the space, while the Top, Bottom, Left, and Right regions remain attached to their borders.

### Example of Usage

```java
BorderPane borderPane = new BorderPane();

Label topLabel = new Label("Top Region");
Label bottomLabel = new Label("Bottom Region");
Label leftLabel = new Label("Left Region");
Label rightLabel = new Label("Right Region");
Label centerLabel = new Label("Center Region");

borderPane.setTop(topLabel);
borderPane.setBottom(bottomLabel);
borderPane.setLeft(leftLabel);
borderPane.setRight(rightLabel);
borderPane.setCenter(centerLabel);
```

In this example:

- `topLabel` is displayed at the top, `bottomLabel` at the bottom, `leftLabel` on the left, `rightLabel` on the right, and `centerLabel` in the center of the `BorderPane`.
- As the window resizes, the `centerLabel` will expand to fill the remaining space, while the other labels stay in their respective positions.

## Comparison of Use Cases

- **Use `AnchorPane`** when you need precise control over node positioning relative to specific edges of the layout.
- **Use `BorderPane`** when you want to organize your layout into a clear, structured set of regions—like a header, footer, sidebars, and main content.
