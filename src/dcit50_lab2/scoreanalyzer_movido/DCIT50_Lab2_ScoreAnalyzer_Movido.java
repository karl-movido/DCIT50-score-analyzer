/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dcit50_lab2.scoreanalyzer_movido;

/**
 *
 * @author karlm
 */
public class DCIT50_Lab2_ScoreAnalyzer_Movido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static double calculateTotal(double[] scores) {
        double total = 0;
        for (double score: scores) {
            total += score;
        }
        
        return total;
    }
    
    public static double calculateAverage(double[] scores) {
        double average = 0;
        
        for (double score: scores) {
            average += score;
        }
        
        return average / 4;
    }
    
    public static double calculateAverage(double score1, double score2, double score3, double score4) {
        double average = score1 + score2 + score3 + score4;
                
        return average / 4;
    }   
    
    public static double findHighest(double[] scores) {
        double highest = scores[0];
        
        for (double score: scores) {
            if (score > highest) {
                highest = score;
            }
        }
        
        return highest;
    }
    
    public static double findLowest(double[] scores) {
        double lowest = scores[0];
        
        for (double score: scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        
        return lowest;
    }
    
}
