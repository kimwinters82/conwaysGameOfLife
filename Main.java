import java.util.*;

class Main {
//global variables
public static int [][] board1 = {
  {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
  {0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  };

public static int [][] board2 = {
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
  };
  public static int gridSize = 20;
  public static int output = 0;
  //need to determine the board turn
  //will always start on board1 but needs to change between the boards each iteration => updateBoardTurn
  public static int [][] boardOn = board1;
  public static int [][] boardOff = board2;


  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int iterations = sc.nextInt();
    // sc.nextLine();
    int iterations = 0;

    // //need to write code for updating state for board 1
    // for (int i=0; i<gridSize; i++){
    //   String temp = sc.nextLine();
    //   String [] chars = temp.split("");
    //   for (int j=0;j<chars.length; j++){
    //     boardOn[i][j] = Integer.parseInt(chars[j]);
    //   }
    // }
    // sc.close();

    for (int i=0;i<gridSize;i++){
        for (int j=0; j<gridSize;j++){
            System.out.print(boardOn[i][j]);
        }
    }
    
    //main body of code to run the state change as many times as specified by input
    for (int i = 0; i<iterations; i++){
      //iterate over every cell in grid for boardOn
      checkEveryCell();
      //once nested loop is finished, reset the old state board to all zeros so I can use it //for the next iteration 
      resetBoard(boardOn);
      //update which board is on/off so same methods can be called on both
      updateBoardTurn();
    }
    //generating the output  
    getOutput(boardOn);
    
  }
  public static void checkEveryCell(){
    for (int i = 0; i< gridSize; i++){
      for (int j = 0; j<gridSize; j++){
        //count the amount of neighbours that are live for each cell
        int n = countNeighbours(i, j);
        //different updates depending if cell itself is on/off
        if (boardOn[i][j] == 0){
          if (n == 3){
            //update next state board only if cell is getting turned on
            updateBoard(i, j);
          }
        }else {
          if (n == 2 || n == 3){
            //update next state board only if cell is getting turned on
            updateBoard(i, j);
          }
        }
      }
    }
  }
  //change which board is considered on/off after each iteration
  public static void updateBoardTurn(){
    if (boardOn == board1){
      boardOn = board2;
      boardOff = board1;
    }else{
      boardOn = board1;
      boardOff = board2;
    }
  }
  //param will be the cell at position num ...
  public static int countNeighbours(int pos1, int pos2){
    //start from zero everytime
    int neighbours = 0;
    //start from negative every time called
    boolean corner = false;
    boolean edge = false;

    if((pos1 == 0 && (pos2 == 0 || pos2 == 19)) || (pos2 == 0 && (pos1 == 0 || pos1 == 19)) || (pos1 == 19 && (pos2 == 0 || pos2 == 19)) || (pos1 == 19 && (pos2 == 0 || pos2 == 19))){
      corner = true;
    }
    else if (pos1 == 0 || pos1 == 19 || pos2 == 0 || pos2 == 19){
      edge = true;
    }

    if (!corner && !edge){
      if(boardOn[pos1-1][pos2-1] == 1){ //topLeft
        neighbours++;
      }if(boardOn[pos1][pos2-1] == 1){ //topCentre
        neighbours++;
      }if(boardOn[pos1+1][pos2-1] == 1){ //topRight
        neighbours++;
      }if(boardOn[pos1-1][pos2] == 1){ //left
        neighbours++;
      }if(boardOn[pos1+1][pos2] == 1){ //right
        neighbours++;
      }if(boardOn[pos1-1][pos2+1] == 1){ //bottomLeft
        neighbours++;
      }if(boardOn[pos1][pos2+1] == 1){ //bottomCentre
        neighbours++;
      }if(boardOn[pos1+1][pos2+1] == 1){ //bottomRight
        neighbours++;
      }
    }
    else if (edge && !corner){
      if (pos1 == 0){
        if(boardOn[pos1][pos2-1] == 1){ //topCentre
          neighbours++;
        }if(boardOn[pos1+1][pos2-1] == 1){ //topRight
          neighbours++;
        }if(boardOn[pos1+1][pos2] == 1){ //right
          neighbours++;
        }if(boardOn[pos1][pos2+1] == 1){ //bottomCentre
          neighbours++;
        }if(boardOn[pos1+1][pos2+1] == 1){ //bottomRight
          neighbours++;
        }
      }else if (pos1 == 19){
        if(boardOn[pos1-1][pos2-1] == 1){ //topLeft
        neighbours++;
      }if(boardOn[pos1][pos2-1] == 1){ //topCentre
        neighbours++;
      }if(boardOn[pos1-1][pos2] == 1){ //left
        neighbours++;
      }if(boardOn[pos1-1][pos2+1] == 1){ //bottomLeft
        neighbours++;
      }if(boardOn[pos1][pos2+1] == 1){ //bottomCentre
        neighbours++;
      }
      }else if (pos2 == 0){
        if(boardOn[pos1-1][pos2] == 1){ //left
          neighbours++;
        }if(boardOn[pos1+1][pos2] == 1){ //right
          neighbours++;
        }if(boardOn[pos1-1][pos2+1] == 1){ //bottomLeft
          neighbours++;
        }if(boardOn[pos1][pos2+1] == 1){ //bottomCentre
          neighbours++;
        }if(boardOn[pos1+1][pos2+1] == 1){ //bottomRight
          neighbours++;
        }
      }else if (pos2 ==19){
        if(boardOn[pos1-1][pos2-1] == 1){ //topLeft
          neighbours++;
        }if(boardOn[pos1][pos2-1] == 1){ //topCentre
          neighbours++;
        }if(boardOn[pos1+1][pos2-1] == 1){ //topRight
          neighbours++;
        }if(boardOn[pos1-1][pos2] == 1){ //left
          neighbours++;
        }if(boardOn[pos1+1][pos2] == 1){ //right
          neighbours++;
        }
      }
    }
    else if (corner){
      if (pos1 == 0 && pos2 == 0){ //top left corner
        if(boardOn[pos1][pos2+1] == 1){ //bottomCentre
          neighbours++;
        }if(boardOn[pos1+1][pos2+1] == 1){ //bottomRight
          neighbours++;
        }if(boardOn[pos1+1][pos2] == 1){ //right
          neighbours++;
        }
      }else if (pos1 == 19 && pos2 == 0){ //top right corner
        if(boardOn[pos1-1][pos2] == 1){ //left
          neighbours++;
        }if(boardOn[pos1-1][pos2+1] == 1){ //bottomLeft
          neighbours++;
        }if(boardOn[pos1][pos2+1] == 1){ //bottomCentre
          neighbours++;
        }
      }else if (pos1 == 0 && pos2 == 19) {//bottom left corner
        if(boardOn[pos1][pos2-1] == 1){ //topCentre
          neighbours++;
        }if(boardOn[pos1+1][pos2-1] == 1){ //topRight
          neighbours++;
        }if(boardOn[pos1+1][pos2] == 1){ //right
          neighbours++;
        }
      }else if(pos1 == 19 && pos2 == 19){ //bottom right corner
        if(boardOn[pos1-1][pos2-1] == 1){ //topLeft
          neighbours++;
        }if(boardOn[pos1][pos2-1] == 1){ //topCentre
          neighbours++;
        }if(boardOn[pos1-1][pos2] == 1){ //left
          neighbours++;
        }
      }
    }
    return neighbours;
  }
  //reset one board back to all 0 after an iteration is complete
  public static void resetBoard(int [][] board){
  for (int i = 0; i< gridSize; i++){
    for (int j = 0; j<gridSize; j++){
        board[i][j] = 0;
      }
  }
  }
  //take in a position in one board and applies to the other
  public static void updateBoard(int pos1, int pos2){
    boardOff[pos1][pos2] = 1;
  }
  //print output after adding how many cells are turned on 
  public static void getOutput(int [][] board){
    for (int i = 0; i<gridSize; i++){
      for (int j = 0; j<gridSize; j++){
        //board as ending count could be either
        output += board[i][j];
      }
    }
    System.out.println();
    System.out.println(output);
  }
}