package com.spring.dao;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.spring.bean.HotelBean;
import com.spring.util.HotelUtil;



public class HotelDAO {
	
		public int insertHotel(HotelBean htl) {
			
			int n=0;
			
			try {
				Session session = HotelUtil.opensession();
				Transaction t = session.beginTransaction();
				n=(Integer)session.save(htl);
				t.commit();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			return n;
		}

		public List<Integer> idList()
		{
			Session session = HotelUtil.opensession();
			Transaction transaction = session.beginTransaction();
			
		  Query query = session.createQuery("select id from HotelBean");
		  List<Integer> list =query.list();
		  session.close();
		  return list;
		}
		/*
		 * public void deleteHotel(HotelBean bean) {
		 * 
		 * Session session = Hibernate }
		 */
		public void deleteHotel(HotelBean bean) {
			
			Session session = HotelUtil.opensession();
			Transaction t = session.beginTransaction();
			
			session.delete(bean);
			t.commit();
			session.close();
		}
		 
		public void updateHotel(HotelBean bean) {
			
			Session session =HotelUtil.opensession();
			Transaction t = session.beginTransaction();
			session.update(bean);
			t.commit();
			session.close();
		}
		 
		public HotelBean findHotel(HotelBean bean) {
			
			HotelBean htl = null;
			
			Session session = HotelUtil.opensession();
			Transaction t = session.beginTransaction();
			
			HotelBean temp = session.find(HotelBean.class, bean.getRmid());
			htl = new HotelBean();
			htl.setRmid(temp.getRmid());
			htl.setRmtype(temp.getRmtype());
			htl.setRmtariff(temp.getRmtariff());
			htl.setRmdesc(temp.getRmdesc());
			htl.setRmoccup(temp.getRmoccup());
			
			return htl;
			
			
			
			
		}
		 
		public List<HotelBean> findAllHotel() {
			
			HotelBean htl = null;
			
			Session session = HotelUtil.opensession();
			Transaction t = session.beginTransaction();
			
			Query query = session.createQuery("from Hotel");
			List<HotelBean> list = query.list();
			t.commit();
			session.close();
			return list;
		}
		 
		 
		 
		}
		 
