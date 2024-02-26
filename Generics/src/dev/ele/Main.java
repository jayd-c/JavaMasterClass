package dev.ele;

import java.util.Scanner;

interface Player {
    String name();
};
record BaseballPlayer(String name, String position) implements Player{

}
record FootballPlayer(String name, String position) implements Player{

}
record VolleyballPlayer (String name, String position) implements Player {
}
public class Main {
    public static void main(String[] args) {


        var philly = new Affiliation("city","PA", "USA");

        BaseballTeam phillies1 = new BaseballTeam("Phillies");
        BaseballTeam astros1 = new BaseballTeam("Astros");
        scoreResult(phillies1,3,astros1,5);

        SportsTeam phillies2 = new SportsTeam("Phillies");
        SportsTeam astros2 = new SportsTeam("Astros");
        scoreResult(phillies2,3,astros2,5);

        Team<FootballPlayer,Affiliation> phillies = new Team<>("Phillies",philly);
        Team<FootballPlayer,Affiliation> astros = new Team("Astros");
        scoreResult(phillies,3,astros,5);

        var harper = new BaseballPlayer("B Harper ", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");

        astros2.addTeamMember(harper);
        astros2.addTeamMember(marsh);

        phillies.listTeamMembers();


        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer,Affiliation> afc = new Team<>("Adelaide Crows",philly);
        var tex = new FootballPlayer("Tex Walker", "Center Half");
        var guthrie = new BaseballPlayer("Guthrei", "mid point");
        afc.addTeamMember(tex);
        //afc.addTeamMember(guthrie); // see does not check the type when we use interfaces.
        afc.listTeamMembers();

        var rory = new FootballPlayer("Rory Lord", "mid field");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer,Affiliation> adelaide = new Team<>("Adelaide Team");
        adelaide.addTeamMember(new VolleyballPlayer("Rob", "SSetter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer,Affiliation>("Cranberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("bodk","suck team"));
        canberra.listTeamMembers();
        scoreResult(canberra,0,adelaide,1);

//        Team<int> melbourne = new Team<int>("Melbourne Vipers"); //does not work for a primitive type.
//        Team<Integer> melbourneVB = new Team<>("Melbourne vipers");


    }

    public static void scoreResult (BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult (SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult (Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
