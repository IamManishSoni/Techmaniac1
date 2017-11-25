package com.techmaniac;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.util.StringUtils.isEmpty;

@Controller
public class GreetingController {

    @RequestMapping("/socialMediaOffers")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "socialmediaoffers";
    }


    @RequestMapping("/login")
    public String checkLogin(@RequestParam(value = "username", required = false) String username,
                             @RequestParam(value = "password", required = false) String password,
                             Model model) {
        model.addAttribute("username", username);
        if (!isEmpty(username) && username.equals("123456")
                &&
                !isEmpty(password) && password.equals("barclays")) {
            return "showTransactions";
        } else
            return "failedLogin";
    }


    @RequestMapping("/stuboffers")
    public ResponseEntity<String> stuboffers(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        String str = "{\n" +
                "  \"offers\": [\n" +
                "    {\n" +
                "      \"id\": \"915590010413342721\",\n" +
                "      \"offerDetail\": \"@SBICard_Connect I have DM you but found any response\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"914700894695911424\",\n" +
                "      \"offerDetail\": \"@SBICard_Connect Can you respond , I need the clarity ASAP\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"914697492578447360\",\n" +
                "      \"offerDetail\": \"@SBICard_Connect can u help w Samsung utasav fridge offer I am told it is 0% emi for 12 m w 5% CB at sargam croma vijaysale is it correct ?\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"914666809395048448\",\n" +
                "      \"offerDetail\": \"@Samsung_IN Hi, tried live chat/website for comparison of 2 models RT39k5538S8 and RT39M5538S8. But no luck. Can u help it’s ASAP.\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"891586844252487680\",\n" +
                "      \"offerDetail\": \"RT @Rohitrajgupta07: @RedmiIndia Does preorder/ flash sale any purpose, all OOS \\uD83D\\uDE1E, Y don't come w sufficient quantity like other competitor…\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"891586505428189184\",\n" +
                "      \"offerDetail\": \"@RedmiIndia Does preorder/ flash sale any purpose, all OOS \\uD83D\\uDE1E, Y don't come w sufficient quantity like other competitors , 2 b reliable band\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"777102698210439168\",\n" +
                "      \"offerDetail\": \"pre - postpaid migration pending 4 last 2 days verification completed 2day can u activate it ASAP. Life impossible wo ph shared det via DM\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"762818596896645120\",\n" +
                "      \"offerDetail\": \".@ToptalLLC consistently puts out some of the best engineering blog posts on the web. Check out https://t.co/F7Xkqnj5Bp\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client</a>\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";


        return new ResponseEntity<>(str, HttpStatus.OK);
    }


    @RequestMapping("/greeting")
    public String greetinssg(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/tabletest")
    public String tabletest(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "tabletest";
    }

    @RequestMapping("/transactions")
    public String transactions(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "transactions";
    }

    @RequestMapping("/showoffers")
    public String shooffers(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "showoffers";
    }

    @RequestMapping("/showTransactions")
    public String showTransactions(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "showTransactions";
    }

    @RequestMapping("/getTransactions")
    public ResponseEntity<String> getTransactions() {
        String strTransactions = "{\n" +
                "  \"transactions\": [\n" +
                "    {\n" +
                "      \"date\": \"2011/11/22\",\n" +
                "      \"transactionDetail\": \"Hilton Hotel\",\n" +
                "      \"amount\": \"£75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2011/11/18\",\n" +
                "      \"transactionDetail\": \"Mac Donald\",\n" +
                "      \"amount\": \"£5.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2011/10/25\",\n" +
                "      \"transactionDetail\": \"Amazon.co.uk\",\n" +
                "      \"amount\": \"£115\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2011/10/21\",\n" +
                "      \"transactionDetail\": \"Gill Bar\",\n" +
                "      \"amount\": \"£26.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2011/10/21\",\n" +
                "      \"transactionDetail\": \"Gill Bar\",\n" +
                "      \"amount\": \"£26.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2011/10/21\",\n" +
                "      \"transactionDetail\": \"Gill Bar\",\n" +
                "      \"amount\": \"£26.3\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"date\": \"2011/10/21\",\n" +
                "      \"transactionDetail\": \"Gill Bar\",\n" +
                "      \"amount\": \"£26.3\"\n" +
                "    }\n" +
                "\n" +
                "  ]\n" +
                "}";
        return new ResponseEntity<String>(strTransactions, HttpStatus.OK);
    }

    @GetMapping(value = "/getsocialMediaOffers")
    public String getOffers() {
        String str = "{\n" +
                "  \"offers\": [\n" +
                "    {\n" +
                "      \"id\": \"915590010413342721\",\n" +
                "      \"offerDetail\": \"@SBICard_Connect I have DM you but found any response\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"914700894695911424\",\n" +
                "      \"offerDetail\": \"@SBICard_Connect Can you respond , I need the clarity ASAP\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"914697492578447360\",\n" +
                "      \"offerDetail\": \"@SBICard_Connect can u help w Samsung utasav fridge offer I am told it is 0% emi for 12 m w 5% CB at sargam croma vijaysale is it correct ?\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"914666809395048448\",\n" +
                "      \"offerDetail\": \"@Samsung_IN Hi, tried live chat/website for comparison of 2 models RT39k5538S8 and RT39M5538S8. But no luck. Can u help it’s ASAP.\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"891586844252487680\",\n" +
                "      \"offerDetail\": \"RT @Rohitrajgupta07: @RedmiIndia Does preorder/ flash sale any purpose, all OOS \\uD83D\\uDE1E, Y don't come w sufficient quantity like other competitor…\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"891586505428189184\",\n" +
                "      \"offerDetail\": \"@RedmiIndia Does preorder/ flash sale any purpose, all OOS \\uD83D\\uDE1E, Y don't come w sufficient quantity like other competitors , 2 b reliable band\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com/download/iphone\\\" rel=\\\"nofollow\\\">Twitter for iPhone</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"777102698210439168\",\n" +
                "      \"offerDetail\": \"pre - postpaid migration pending 4 last 2 days verification completed 2day can u activate it ASAP. Life impossible wo ph shared det via DM\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client</a>\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"762818596896645120\",\n" +
                "      \"offerDetail\": \".@ToptalLLC consistently puts out some of the best engineering blog posts on the web. Check out https://t.co/F7Xkqnj5Bp\",\n" +
                "      \"offerLink\": \"<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client</a>\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return str;
    }



}