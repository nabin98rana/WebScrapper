/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Webscrapper;

import com.leapfrog.Webscrapper.entity.Jobs;
import com.leapfrog.Webscrapper.util.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Navin
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Document doc = getContent("http://jobsnepal.com");
            Elements elements = doc.select(" table.gridx td.pl-15 a.job-item ");
            List<Jobs> jobList = new ArrayList<>();
            String[] JobDetails;

            StringBuilder builder = new StringBuilder();

           // System.out.println("Please wait......");
            System.out.println("Crawling...");
            for (Element e : elements) {
                
                System.out.println("Job Title:" + e.html());
                System.out.println("Link:" + e.attr("href"));

                Document pageDoc = getContent(e.attr("href"));
                Elements companyName = pageDoc.select("div#about-company ul li a");
                Elements companyAddress = pageDoc.select("div#about-company ul li");
                Elements experience = pageDoc.select("div#experience ul li ");
                Elements openings = pageDoc.select("div#openings ul li a");
                String[] address = companyAddress.html().split(":");

                Elements jobOverview = pageDoc.select("div#job-overview");
                builder.append(e.html() + "," + e.attr("href") + "," + companyName.html() + "," + address.toString() + "," + experience.text() + ",");

            }
            System.out.println(builder.toString());
            DateFormat dateFormate = new SimpleDateFormat("mm-dd-yyyy");
            //long time=Calendar.getInstance().getTimeInMillis();
            String scrapDate = dateFormate.format(Calendar.getInstance().getTimeInMillis());

            File fileName=new File("job_scrapper"+scrapDate+".csv");
            File file=new File("d:/"+fileName);
            System.out.println(!file.exists() ?  FileHandler.write("d:/"+fileName,builder.toString())  : "There is existing scrapper file");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());

        }

    }

    private static Document getContent(String url) throws IOException {
        return Jsoup.connect(url).get();
    }

}
