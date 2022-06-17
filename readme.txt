Instructions to follow to Setup the Project:

1. Open the Project in IntelliJ or any JAVA IDE

2. Run the DemoApplication.java file

3. Go to localhost:8080 on any webbrowser

4. Configure Prometheus database

5. Go to prometheus.yml file and add the following
	  - job_name: "spring-actuator"
    metrics_path: "/actuator/prometheus"
    scrape_interval: 5s
    static_configs:
    - targets: ["localhost:8080"]

6. Run prometheus server through cmd by running '.\prometheus.exe' command

7. Go to localhost:9090 to get the prometheus dashboard and press on the globe icon beside execute button to get metrics queries

8. Create a Grafana Dashboard with the prometheus queries

9. Optionally you can also Import the Dashboard I made by copying the content in dashboard.json file

10. Set Alerts and annotations as per your requirements

----THE END-----