package com.saikiran.assignment;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Vechicle
{
		@Resource //IF NAME DOES NOT QUALIFY IT AUTOWIRES BY TYPE
		@Qualifier("bus1")
		private Bus bus; 
		@Autowired //is same as @Inject
		@Qualifier("car")
		private Car car;
		public Bus getBus() {
			return bus;
		}

		@Required
		public void setBus(Bus bus) {
			this.bus = bus;
		}
		public Car getCar() {
			return car;
		}
		public void setCar(Car car) {
			this.car = car;
		}
		@Override
		public String toString() {
			return "Vehicle [bus=" + bus + ", car=" + car + "]";
		}
		

}
