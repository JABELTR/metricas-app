package com.empresa.monitoreo_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

@RestController
@RequestMapping("/api/metricas")
public class MetricasController {

    @GetMapping
    public String obtenerMetricas() {
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        return "CPU Load: " + osBean.getSystemLoadAverage() + "%, Memoria Disponible: " + Runtime.getRuntime().freeMemory();
    }
}

