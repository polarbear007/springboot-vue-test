package cn.itcast.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.entity.Person;

@Controller
public class PersonController {
	@ResponseBody
	@RequestMapping("/addPerson")
	// 因为是使用 json 格式提交的数据，所以我们这里需要添加 @RequestBody 才能正确解析
	public Person addPerson(@RequestBody Person person) {
		// 打印一下看能不能正确获取表单的 json 格式数据
		System.out.println("addPerson: " + person);
		// 修改一下 person 格式数据，看 vue 能不能正确更新数据
		person.setUsername("Eric");
		person.setBirthDate(new Date());
		person.setGender("male");
		person.setProvince("shanghai");
		person.setIntersts(new String[] {"watching tv", "cooking"});
		return person;
	}
	
	@ResponseBody
	@RequestMapping("/addPerson2")
	public Person addPerson2(Person person) {
		// 打印一下看能不能正确获取表单的 json 格式数据
		System.out.println("addPerson2: " + person);
		// 修改一下 person 格式数据，看 vue 能不能正确更新数据
		person.setUsername("Rose");
		person.setBirthDate(new Date());
		person.setGender("female");
		person.setProvince("guangdong");
		person.setIntersts(new String[] {"reading", "cooking"});
		return person;
	}
	
	@ResponseBody
	@RequestMapping("/addPerson3")
	public Person addPerson3(Person person) {
		System.out.println("addPerson3: " + person);
		// 这个不是异步处理，所以我们直接返回表单数据就好了
		return person;
	}
}
