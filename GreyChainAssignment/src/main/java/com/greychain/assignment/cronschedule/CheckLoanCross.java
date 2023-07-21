package com.greychain.assignment.cronschedule;


import com.greychain.assignment.service.LoanService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import java.util.logging.Logger;


public class CheckLoanCross {
    private static final Logger log = (Logger) LoggerFactory.getLogger(CheckLoanCross.class);

    @Autowired
    LoanService loanService;

    @Scheduled(cron = "${loan.cross.schedule}")
    public void reportCurrentTime() {
        if (!loanService.getCrossFlag()) {
            log.info("Your loan date is crossed due date !");
        }

    }
}
