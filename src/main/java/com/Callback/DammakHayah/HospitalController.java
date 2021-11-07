package com.Callback.DammakHayah;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HospitalController {

@GetMapping("/hospital")
    public String hospital(){


        return "hospital";
    }
   // Positive Negative

    @GetMapping("/all")
    public String allDonors(){


        return "allDonors";
    }
    @GetMapping("/ap")
    public String aPositive(){


        return "aPositive";
    }
    @GetMapping("/an")
    public String aNegative(){


        return "aNegative";
    }
    @GetMapping("/bp")
    public String bPositive(){


        return "bPositive";
    }
    @GetMapping("/bn")
    public String bNegative(){


        return "bNegative";
    }
    @GetMapping("/abp")
    public String abPositive(){


        return "abPositive";
    }
    @GetMapping("/abn")
    public String abNegative(){


        return "abNegative";
    }
    @GetMapping("/op")
    public String oPositive(){


        return "oPositive";
    }
    @GetMapping("/on")
    public String oNegative(){


        return "oNegative";
    }
}