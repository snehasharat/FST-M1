player1 = input ("Enter Player1 name : ")
player2 = input ("Enter Player2 name : ")
player1_answer = input (player1 + " , do you want to choose rock, paper or scissors? ").lower()
player2_answer = input (player2 + " , do you want to choose rock, paper or scissors? ").lower()

if (player1_answer == player2_answer):
    print("It is a tie")
elif(player1_answer == "rock"):
    if(player2_answer == "scissors"):
        print("Rock wins")
    else:
        print("Paper wins")
elif(player1_answer == "paper"):
    if(player2_answer == "rock"):
        print("paper wins")
    else:
        print("Scissors wins")
elif(player1_answer == "scissors"):
    if(player2_answer == "rock"):
        print("Rock wins")
    else:
        print("Scissors wins")
else:
    print("Invalid input entered by user")
