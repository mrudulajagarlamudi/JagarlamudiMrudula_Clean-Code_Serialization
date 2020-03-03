package com.epam1.CleanCode;
public class App 
{
    public static void main( String[] args )
    {
        Interest_Calculation interestcalculation = new Interest_Calculation();
        interestcalculation.takeInput();
        HouseConstruction houseConstruction = new HouseConstruction();
        houseConstruction.constructionCost();
    }
}