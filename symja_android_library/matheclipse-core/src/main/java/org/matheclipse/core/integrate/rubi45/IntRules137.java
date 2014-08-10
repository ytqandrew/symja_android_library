package org.matheclipse.core.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi45.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules137 { 
  public static IAST RULES = List( 
ISetDelayed(Int(Times(Power(Plus(Times($(pf_,Times(Power(Plus(Times(g_DEFAULT,x_),f_DEFAULT),CN1D2),Sqrt(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),c_DEFAULT)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(x_,pb_DEFAULT),Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),CN1)),x_Symbol),
    Condition(Times(g,Power(pc,CN1),Subst(Int(Times(Power(Plus(a,Times(b,$(pf,Times(c,x)))),pn),Power(x,CN1)),x),x,Times(Sqrt(Plus(pd,Times(pe,x))),Power(Plus(f,Times(g,x)),CN1D2)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,g,pa,pb,pc,pf),x),ZeroQ(Plus(pe,g))),ZeroQ(Plus(pd,f,Times(CN1,C2)))),ZeroQ(Plus(Times(pa,Sqr(pe)),Times(pc,pd,f)))),ZeroQ(Plus(Times(C2,pc,Plus(pd,Times(CN1,C1))),Times(CN1,pb,pe)))))),
ISetDelayed(Int(Times(Power(Plus(Times($(pf_,Times(Power(Plus(C1,Times(g_DEFAULT,x_)),CN1D2),Sqrt(Plus(C1,Times(x_,pe_DEFAULT))),c_DEFAULT)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),CN1)),x_Symbol),
    Condition(Times(g,Power(pc,CN1),Subst(Int(Times(Power(Plus(a,Times(b,$(pf,Times(c,x)))),pn),Power(x,CN1)),x),x,Times(Sqrt(Plus(C1,Times(pe,x))),Power(Plus(C1,Times(g,x)),CN1D2)))),And(And(FreeQ(List(a,b,c,pe,g,pa,pc,pf),x),ZeroQ(Plus(pe,g))),ZeroQ(Plus(Times(pa,Sqr(pe)),pc))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(pf_,Times(Power(Plus(Times(g_DEFAULT,x_),f_DEFAULT),CN1D2),Sqrt(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT)),c_DEFAULT)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(x_,pb_DEFAULT),Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),CN1)),x_Symbol),
    Condition(Times(g,Power(pc,CN1),Subst(Int(Times(Power(Plus(a,Times(b,Power(pf,Times(c,x)))),pn),Power(x,CN1)),x),x,Times(Sqrt(Plus(pd,Times(pe,x))),Power(Plus(f,Times(g,x)),CN1D2)))),And(And(And(And(FreeQ(List(a,b,c,pd,pe,f,g,pa,pb,pc,pf),x),ZeroQ(Plus(pe,g))),ZeroQ(Plus(pd,f,Times(CN1,C2)))),ZeroQ(Plus(Times(pa,Sqr(pe)),Times(pc,pd,f)))),ZeroQ(Plus(Times(C2,pc,Plus(pd,Times(CN1,C1))),Times(CN1,pb,pe)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(pf_,Times(Power(Plus(C1,Times(g_DEFAULT,x_)),CN1D2),Sqrt(Plus(C1,Times(x_,pe_DEFAULT))),c_DEFAULT)),b_DEFAULT),a_DEFAULT),pn_DEFAULT),Power(Plus(Times(Sqr(x_),pc_DEFAULT),pa_DEFAULT),CN1)),x_Symbol),
    Condition(Times(g,Power(pc,CN1),Subst(Int(Times(Power(Plus(a,Times(b,Power(pf,Times(c,x)))),pn),Power(x,CN1)),x),x,Times(Sqrt(Plus(C1,Times(pe,x))),Power(Plus(C1,Times(g,x)),CN1D2)))),And(And(FreeQ(List(a,b,c,pe,g,pa,pc,pf),x),ZeroQ(Plus(pe,g))),ZeroQ(Plus(Times(pa,Sqr(pe)),pc))))),
ISetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times(x_,pe_DEFAULT),pd_DEFAULT),pn_DEFAULT),c_DEFAULT)),b_DEFAULT),a_DEFAULT),p_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(v,ExpandIntegrand(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(pd,Times(pe,x)),pn))))),p),u,x))),Condition(Int(v,x),SumQ(v))),FreeQ(List(a,b,c,pd,pe,pn,p),x))),
ISetDelayed(Int(Times(Log(Times(Power(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_DEFAULT),p_DEFAULT),c_DEFAULT)),u_),x_Symbol),
    Condition(Module(List(Set(v,ExpandIntegrand(Log(Times(c,Power(Plus(a,Times(b,Power(x,pn))),p))),u,x))),Condition(Int(v,x),SumQ(v))),FreeQ(List(a,b,c,pn,p),x))),
ISetDelayed(Int(Times(Power(Log(Times(Power(Times(Power(Plus(Times(b_DEFAULT,x_),a_DEFAULT),$p("n1",true)),Power(Plus(Times(x_,pd_DEFAULT),c_DEFAULT),$p("n2")),$p("e1",true)),pn_DEFAULT),pe_DEFAULT)),p_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(v,ExpandIntegrand(Power(Log(Times(pe,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Plus(c,Times(pd,x)),$s("n2"))),pn))),p),u,x))),Condition(Int(v,x),SumQ(v))),FreeQ(List(a,b,c,pd,pe,pn,$s("e1"),$s("n1"),p),x))),
ISetDelayed(Int(Times(Power(y_,CN1),u_),x_Symbol),
    Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Log(RemoveContent(y,x))),Not(FalseQ(q))))),
ISetDelayed(Int(Times(Power(Times(w_,y_),CN1),u_),x_Symbol),
    Module(List(Set(q,DerivativeDivides(Times(y,w),u,x))),Condition(Times(q,Log(RemoveContent(Times(y,w),x))),Not(FalseQ(q))))),
ISetDelayed(Int(Times(Power(y_,m_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Power(y,Plus(m,C1)),Power(Plus(m,C1),CN1)),Not(FalseQ(q)))),And(FreeQ(m,x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(Times(Power(y_,m_DEFAULT),Power(z_,pn_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(Times(y,z),Times(u,Power(z,Plus(pn,Times(CN1,m)))),x))),Condition(Times(q,Power(y,Plus(m,C1)),Power(z,Plus(m,C1)),Power(Plus(m,C1),CN1)),Not(FalseQ(q)))),And(FreeQ(List(m,pn),x),NonzeroQ(Plus(m,C1))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set(v,SimplifyIntegrand(u,x))),Condition(Int(v,x),SimplerIntegrandQ(v,u,x)))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Power(x_,pn_DEFAULT),pd_DEFAULT),c_DEFAULT)),f_DEFAULT),Times(Sqrt(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_DEFAULT)),pe_DEFAULT)),m_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Plus(Times(a,Sqr(pe)),Times(CN1,c,Sqr(f))),m),Int(ExpandIntegrand(Times(u,Power(Plus(Times(pe,Sqrt(Plus(a,Times(b,Power(x,pn))))),Times(CN1,f,Sqrt(Plus(c,Times(pd,Power(x,pn)))))),Times(CN1,m))),x),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,pn),x),NegativeIntegerQ(m)),ZeroQ(Plus(Times(b,Sqr(pe)),Times(CN1,pd,Sqr(f))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Sqrt(Plus(Times(Power(x_,pn_DEFAULT),pd_DEFAULT),c_DEFAULT)),f_DEFAULT),Times(Sqrt(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),a_DEFAULT)),pe_DEFAULT)),m_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Plus(Times(b,Sqr(pe)),Times(CN1,pd,Sqr(f))),m),Int(ExpandIntegrand(Times(u,Power(x,Times(m,pn)),Power(Plus(Times(pe,Sqrt(Plus(a,Times(b,Power(x,pn))))),Times(CN1,f,Sqrt(Plus(c,Times(pd,Power(x,pn)))))),Times(CN1,m))),x),x)),And(And(FreeQ(List(a,b,c,pd,pe,f,pn),x),NegativeIntegerQ(m)),ZeroQ(Plus(Times(a,Sqr(pe)),Times(CN1,c,Sqr(f))))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(u_,pn_),a_DEFAULT),v_),p_DEFAULT),Power(u_,m_DEFAULT),w_),x_Symbol),
    Condition(Int(Times(Power(u,Plus(m,Times(pn,p))),Power(Plus(a,Times(Power(u,Times(CN1,pn)),v)),p),w),x),And(And(And(FreeQ(List(a,m,pn),x),IntegerQ(p)),Not(PositiveQ(pn))),Not(FreeQ(v,x))))),
ISetDelayed(Int(Times(Power(Plus(Times(b_DEFAULT,y_),a_DEFAULT),m_DEFAULT),Power(Plus(Times(v_,pd_DEFAULT),c_DEFAULT),pn_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn)),x),x,y)),Not(FalseQ(q)))),And(FreeQ(List(a,b,c,pd,m,pn),x),ZeroQ(Plus(y,Times(CN1,v)))))),
ISetDelayed(Int(Times(Power(Plus(Times(f_DEFAULT,w_),pe_DEFAULT),p_DEFAULT),Power(Plus(Times(b_DEFAULT,y_),a_DEFAULT),m_DEFAULT),Power(Plus(Times(v_,pd_DEFAULT),c_DEFAULT),pn_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p)),x),x,y)),Not(FalseQ(q)))),And(And(FreeQ(List(a,b,c,pd,pe,f,m,pn,p),x),ZeroQ(Plus(y,Times(CN1,v)))),ZeroQ(Plus(y,Times(CN1,w)))))),
ISetDelayed(Int(Times(Power(Plus(Times(f_DEFAULT,w_),pe_DEFAULT),p_DEFAULT),Power(Plus(Times(b_DEFAULT,y_),a_DEFAULT),m_DEFAULT),Power(Plus(Times(h_DEFAULT,z_),g_DEFAULT),q_DEFAULT),Power(Plus(Times(v_,pd_DEFAULT),c_DEFAULT),pn_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(r,DerivativeDivides(y,u,x))),Condition(Times(r,Subst(Int(Times(Power(Plus(a,Times(b,x)),m),Power(Plus(c,Times(pd,x)),pn),Power(Plus(pe,Times(f,x)),p),Power(Plus(g,Times(h,x)),q)),x),x,y)),Not(FalseQ(r)))),And(And(And(FreeQ(List(a,b,c,pd,pe,f,g,h,m,pn,p,q),x),ZeroQ(Plus(y,Times(CN1,v)))),ZeroQ(Plus(y,Times(CN1,w)))),ZeroQ(Plus(y,Times(CN1,z)))))),
ISetDelayed(Int(Times(Plus(Times(Power(y_,pn_),b_DEFAULT),a_),u_DEFAULT),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Plus(Times(a,Int(u,x)),Times(b,q,Subst(Int(Power(x,pn),x),x,y))),Not(FalseQ(q)))),FreeQ(List(a,b,pn),x))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(y_,pn_),b_DEFAULT),a_DEFAULT),p_),u_DEFAULT),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Power(Plus(a,Times(b,Power(x,pn))),p),x),x,y)),Not(FalseQ(q)))),FreeQ(List(a,b,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(y_,pn_),b_DEFAULT),a_DEFAULT),p_DEFAULT),Power(v_,m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,pn))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(v,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),FreeQ(List(a,b,m,pn,p),x))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(y_,pn_),b_DEFAULT),Times(Power(v_,j_DEFAULT),c_DEFAULT),a_DEFAULT),p_),u_DEFAULT),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),p),x),x,y)),Not(FalseQ(q)))),And(And(FreeQ(List(a,b,c,pn,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(y,Times(CN1,v)))))),
ISetDelayed(Int(Times(Power(Times(Plus(Times(Power(v_,pn_),b_DEFAULT),Times(Power(w_,j_DEFAULT),c_DEFAULT),a_DEFAULT),Plus(Times(Power(y_,pn_),pb_DEFAULT),pa_)),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),p)),x),x,y)),Not(FalseQ(q)))),And(And(And(FreeQ(List(a,b,c,pa,pb,pn,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(y,Times(CN1,v)))),ZeroQ(Plus(y,Times(CN1,w)))))),
ISetDelayed(Int(Times(Power(Times(Plus(Times(Power(w_,j_DEFAULT),c_DEFAULT),a_DEFAULT),Plus(Times(Power(y_,pn_),pb_DEFAULT),pa_)),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(c,Power(x,Times(C2,pn)))),p)),x),x,y)),Not(FalseQ(q)))),And(And(FreeQ(List(a,c,pa,pb,pn,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(y,Times(CN1,w)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(y_,pn_),b_DEFAULT),Times(Power(w_,j_DEFAULT),c_DEFAULT),a_DEFAULT),p_DEFAULT),Power(v_,m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(v,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),And(And(FreeQ(List(a,b,c,m,pn,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(y,Times(CN1,w)))))),
ISetDelayed(Int(Times(Plus(Times(Power(y_,pn_),pb_DEFAULT),pa_),Power(Plus(Times(Power(v_,pn_),b_DEFAULT),Times(Power(w_,j_DEFAULT),c_DEFAULT),a_DEFAULT),p_DEFAULT),Power(z_,m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(z,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),And(And(And(FreeQ(List(a,b,c,pa,pb,m,pn,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(y,Times(CN1,v)))),ZeroQ(Plus(y,Times(CN1,w)))))),
ISetDelayed(Int(Times(Plus(Times(Power(y_,pn_),pb_DEFAULT),pa_),Power(Plus(Times(Power(w_,j_DEFAULT),c_DEFAULT),a_DEFAULT),p_DEFAULT),Power(z_,m_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(q,r),Condition(Times(q,r,Subst(Int(Times(Power(x,m),Plus(pa,Times(pb,Power(x,pn))),Power(Plus(a,Times(c,Power(x,Times(C2,pn)))),p)),x),x,y)),And(Not(FalseQ(Set(r,Divides(Power(y,m),Power(z,m),x)))),Not(FalseQ(Set(q,DerivativeDivides(y,u,x))))))),And(And(FreeQ(List(a,c,pa,pb,m,pn,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(y,Times(CN1,w)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(y_,pn_),b_DEFAULT),a_DEFAULT),m_DEFAULT),Power(Plus(Times(Power(v_,pn_),pd_DEFAULT),c_DEFAULT),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(y,u,x))),Condition(Times(q,Subst(Int(Times(Power(Plus(a,Times(b,Power(x,pn))),m),Power(Plus(c,Times(pd,Power(x,pn))),p)),x),x,y)),Not(FalseQ(q)))),And(FreeQ(List(a,b,c,pd,m,pn,p),x),ZeroQ(Plus(y,Times(CN1,v)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(y_,pn_),b_DEFAULT),a_DEFAULT),m_DEFAULT),Power(Plus(Times(Power(w_,pn_),f_DEFAULT),pe_DEFAULT),q_DEFAULT),Power(Plus(Times(Power(v_,pn_),pd_DEFAULT),c_DEFAULT),p_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Module(List(Set(r,DerivativeDivides(y,u,x))),Condition(Times(r,Subst(Int(Times(Power(Plus(a,Times(b,Power(x,pn))),m),Power(Plus(c,Times(pd,Power(x,pn))),p),Power(Plus(pe,Times(f,Power(x,pn))),q)),x),x,y)),Not(FalseQ(r)))),And(And(FreeQ(List(a,b,c,pd,pe,f,m,pn,p,q),x),ZeroQ(Plus(y,Times(CN1,v)))),ZeroQ(Plus(y,Times(CN1,w)))))),
ISetDelayed(Int(Times(Power(pf_,v_),u_),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(v,u,x))),Condition(Times(q,Power(pf,v),Power(Log(pf),CN1)),Not(FalseQ(q)))),FreeQ(pf,x))),
ISetDelayed(Int(Times(Power(w_,m_DEFAULT),Power(pf_,v_),u_),x_Symbol),
    Condition(Module(List(Set(q,DerivativeDivides(v,u,x))),Condition(Times(q,Subst(Int(Times(Power(x,m),Power(pf,x)),x),x,v)),Not(FalseQ(q)))),And(FreeQ(List(pf,m),x),ZeroQ(Plus(w,Times(CN1,v)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,p_DEFAULT),Power(w_,p_DEFAULT),b_DEFAULT),a_),m_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(w,D(v,x)),Times(v,D(w,x))),CN1))))),Condition(Times(c,Subst(Int(Power(Plus(a,Times(b,Power(x,p))),m),x),x,Times(v,w))),FreeQ(c,x))),And(FreeQ(List(a,b,m,p),x),IntegerQ(p)))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,p_DEFAULT),Power(w_,q_DEFAULT),b_DEFAULT),a_),m_DEFAULT),Power(v_,r_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(q,v,D(w,x))),CN1))))),Condition(Times(c,p,Power(Plus(r,C1),CN1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(p,Power(Plus(r,C1),CN1))))),m),x),x,Times(Power(v,Plus(r,C1)),w))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q,r),x),ZeroQ(Plus(p,Times(CN1,q,Plus(r,C1))))),NonzeroQ(Plus(r,C1))),IntegerQ(Times(p,Power(Plus(r,C1),CN1)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,p_DEFAULT),Power(w_,q_DEFAULT),b_DEFAULT),a_),m_DEFAULT),Power(v_,r_DEFAULT),Power(w_,s_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(q,v,D(w,x))),CN1))))),Condition(Times(c,p,Power(Plus(r,C1),CN1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(p,Power(Plus(r,C1),CN1))))),m),x),x,Times(Power(v,Plus(r,C1)),Power(w,Plus(s,C1))))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q,r,s),x),ZeroQ(Plus(Times(p,Plus(s,C1)),Times(CN1,q,Plus(r,C1))))),NonzeroQ(Plus(r,C1))),IntegerQ(Times(p,Power(Plus(r,C1),CN1)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,p_DEFAULT),a_DEFAULT),Times(Power(w_,q_DEFAULT),b_DEFAULT)),m_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),CN1))))),Condition(Times(c,p,Subst(Int(Power(Plus(b,Times(a,Power(x,p))),m),x),x,Times(v,Power(w,Plus(Times(m,q),C1))))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q),x),ZeroQ(Plus(p,Times(q,Plus(Times(m,p),C1))))),IntegerQ(p)),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,p_DEFAULT),a_DEFAULT),Times(Power(w_,q_DEFAULT),b_DEFAULT)),m_DEFAULT),Power(v_,r_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),CN1))))),Condition(Times(CN1,c,q,Subst(Int(Power(Plus(a,Times(b,Power(x,q))),m),x),x,Times(Power(v,Plus(Times(m,p),r,C1)),w))),FreeQ(c,x))),And(And(And(FreeQ(List(a,b,m,p,q,r),x),ZeroQ(Plus(p,Times(q,Plus(Times(m,p),r,C1))))),IntegerQ(q)),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,p_DEFAULT),a_DEFAULT),Times(Power(w_,q_DEFAULT),b_DEFAULT)),m_DEFAULT),Power(w_,s_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),CN1))))),Condition(Times(CN1,c,q,Power(Plus(s,C1),CN1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(q,Power(Plus(s,C1),CN1))))),m),x),x,Times(Power(v,Plus(Times(m,p),C1)),Power(w,Plus(s,C1))))),FreeQ(c,x))),And(And(And(And(FreeQ(List(a,b,m,p,q,s),x),ZeroQ(Plus(Times(p,Plus(s,C1)),Times(q,Plus(Times(m,p),C1))))),NonzeroQ(Plus(s,C1))),IntegerQ(Times(q,Power(Plus(s,C1),CN1)))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,p_DEFAULT),a_DEFAULT),Times(Power(w_,q_DEFAULT),b_DEFAULT)),m_DEFAULT),Power(v_,r_DEFAULT),Power(w_,s_DEFAULT),u_),x_Symbol),
    Condition(Module(List(Set(c,Simplify(Times(u,Power(Plus(Times(p,w,D(v,x)),Times(CN1,q,v,D(w,x))),CN1))))),Condition(Times(CN1,c,q,Power(Plus(s,C1),CN1),Subst(Int(Power(Plus(a,Times(b,Power(x,Times(q,Power(Plus(s,C1),CN1))))),m),x),x,Times(Power(v,Plus(Times(m,p),r,C1)),Power(w,Plus(s,C1))))),FreeQ(c,x))),And(And(And(And(FreeQ(List(a,b,m,p,q,r,s),x),ZeroQ(Plus(Times(p,Plus(s,C1)),Times(q,Plus(Times(m,p),r,C1))))),NonzeroQ(Plus(s,C1))),IntegerQ(Times(q,Power(Plus(s,C1),CN1)))),IntegerQ(m)))),
ISetDelayed(Int(Times(Power(x_,m_DEFAULT),u_),x_Symbol),
    Condition(Times(Power(Plus(m,C1),CN1),Subst(Int(SubstFor(Power(x,Plus(m,C1)),u,x),x),x,Power(x,Plus(m,C1)))),And(And(FreeQ(m,x),NonzeroQ(Plus(m,C1))),FunctionOfQ(Power(x,Plus(m,C1)),u,x)))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set($s("lst"),SubstForFractionalPowerOfLinear(u,x))),Condition(Times(Part($s("lst"),C2),Part($s("lst"),C4),Subst(Int(Part($s("lst"),C1),x),x,Power(Part($s("lst"),C3),Power(Part($s("lst"),C2),CN1)))),And(NotFalseQ($s("lst")),SubstForFractionalPowerQ(u,Part($s("lst"),C3),x))))),
ISetDelayed(Int(u_,x_Symbol),
    Module(List(Set($s("lst"),SubstForFractionalPowerOfQuotientOfLinears(u,x))),Condition(Times(Part($s("lst"),C2),Part($s("lst"),C4),Subst(Int(Part($s("lst"),C1),x),x,Power(Part($s("lst"),C3),Power(Part($s("lst"),C2),CN1)))),NotFalseQ($s("lst"))))),
ISetDelayed(Int(Times(Power(Times(a_,v_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(a,Plus(p,Times(CN1,C1D2))),Sqrt(Times(a,v)),Power(v,CN1D2),Int(Times(u,Power(v,p)),x)),And(FreeQ(a,x),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Times(a_,v_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(a,Plus(p,C1D2)),Sqrt(v),Power(Times(a,v),CN1D2),Int(Times(u,Power(v,p)),x)),And(FreeQ(a,x),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(Times(a_,v_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Times(a,v),p),Power(Power(v,p),CN1),Int(Times(u,Power(v,p)),x)),And(FreeQ(List(a,p),x),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(Power(Power(v_,m_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Sqrt(Power(v,m)),Power(Power(v,Times(C1D2,m)),CN1),Int(Times(u,Power(v,Times(m,p))),x)),And(FreeQ(m,x),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Power(v_,m_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(v,Times(C1D2,m)),Power(Power(v,m),CN1D2),Int(Times(u,Power(v,Times(m,p))),x)),And(FreeQ(m,x),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(Power(v_,m_),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Power(v,m),p),Power(Power(v,Times(m,p)),CN1),Int(Times(u,Power(v,Times(m,p))),x)),And(FreeQ(List(m,p),x),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(Power(Times(Power(v_,m_DEFAULT),Power(w_,pn_DEFAULT)),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Sqrt(Times(Power(v,m),Power(w,pn))),Power(Times(Power(v,Times(C1D2,m)),Power(w,Times(C1D2,pn))),CN1),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(pn,p))),x)),And(FreeQ(List(m,pn),x),PositiveIntegerQ(Plus(p,C1D2))))),
ISetDelayed(Int(Times(Power(Times(Power(v_,m_DEFAULT),Power(w_,pn_DEFAULT)),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(v,Times(C1D2,m)),Power(w,Times(C1D2,pn)),Power(Times(Power(v,m),Power(w,pn)),CN1D2),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(pn,p))),x)),And(FreeQ(List(m,pn),x),NegativeIntegerQ(Plus(p,Times(CN1,C1D2)))))),
ISetDelayed(Int(Times(Power(Times(Power(v_,m_DEFAULT),Power(w_,pn_DEFAULT)),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Times(Power(v,m),Power(w,pn)),p),Power(Times(Power(v,Times(m,p)),Power(w,Times(pn,p))),CN1),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(pn,p))),x)),And(FreeQ(List(m,pn,p),x),Not(IntegerQ(Times(C2,p)))))),
ISetDelayed(Int(Times(Power(Times(Power(v_,m_DEFAULT),Power(w_,pn_DEFAULT),Power(z_,q_DEFAULT)),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Times(Power(v,m),Power(w,pn),Power(z,q)),p),Power(Times(Power(v,Times(m,p)),Power(w,Times(pn,p)),Power(z,Times(p,q))),CN1),Int(Times(u,Power(v,Times(m,p)),Power(w,Times(pn,p)),Power(z,Times(p,q))),x)),And(FreeQ(List(m,pn,p,q),x),Not(IntegerQ(p))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,pn_),b_DEFAULT),a_DEFAULT),p_),u_DEFAULT),x_Symbol),
    Condition(Times(FullSimplify(Times(Sqrt(Plus(a,Times(b,Power(x,pn)))),Power(Times(Power(x,Times(C1D2,pn)),Sqrt(Plus(b,Times(a,Power(Power(x,pn),CN1))))),CN1))),Int(Times(u,Power(x,Times(pn,p)),Power(Plus(b,Times(a,Power(x,Times(CN1,pn)))),p)),x)),And(And(And(FreeQ(List(a,b,p),x),IntegerQ(Plus(p,C1D2))),NegativeIntegerQ(pn)),Not(RationalFunctionQ(u,x))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,pn_),b_DEFAULT),a_DEFAULT),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(v,pn))),p),Power(Times(Power(v,Times(pn,p)),Power(Plus(b,Times(a,Power(v,Times(CN1,pn)))),p)),CN1),Int(Times(u,Power(v,Times(pn,p)),Power(Plus(b,Times(a,Power(v,Times(CN1,pn)))),p)),x)),And(And(And(And(FreeQ(List(a,b,p),x),Not(IntegerQ(p))),NegativeIntegerQ(pn)),BinomialQ(v,x)),Not(LinearQ(v,x))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(v_,pn_),Power(x_,m_DEFAULT),b_DEFAULT),a_DEFAULT),p_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(x,m),Power(v,pn))),p),Power(Times(Power(v,Times(pn,p)),Power(Plus(Times(b,Power(x,m)),Times(a,Power(v,Times(CN1,pn)))),p)),CN1),Int(Times(u,Power(v,Times(pn,p)),Power(Plus(Times(b,Power(x,m)),Times(a,Power(v,Times(CN1,pn)))),p)),x)),And(And(And(FreeQ(List(a,b,m,p),x),Not(IntegerQ(p))),NegativeIntegerQ(pn)),BinomialQ(v,x)))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,r_DEFAULT),a_DEFAULT),Times(Power(x_,s_DEFAULT),b_DEFAULT)),m_),u_DEFAULT),x_Symbol),
    Condition(Times(Power(Plus(Times(a,Power(x,r)),Times(b,Power(x,s))),m),Power(Times(Power(x,Times(m,r)),Power(Plus(a,Times(b,Power(x,Plus(s,Times(CN1,r))))),m)),CN1),Int(Times(u,Power(x,Times(m,r)),Power(Plus(a,Times(b,Power(x,Plus(s,Times(CN1,r))))),m)),x)),And(And(FreeQ(List(a,b,m,r,s),x),Not(IntegerQ(m))),PosQ(Plus(s,Times(CN1,r)))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,pn_),b_DEFAULT),a_),CN1),u_),x_Symbol),
    Condition(Int(RationalFunctionExpand(Times(u,Power(Plus(a,Times(b,Power(x,pn))),CN1)),x),x),And(FreeQ(List(a,b),x),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,j_DEFAULT),c_DEFAULT),a_DEFAULT),p_DEFAULT),u_),x_Symbol),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(x,pn))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,pn),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),IntegerQ(p)),Not(AlgebraicFunctionQ(u,x))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,j_DEFAULT),c_DEFAULT),a_DEFAULT),p_),u_),x_Symbol),
    Condition(Times(Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),p),Power(Power(Plus(b,Times(C2,c,Power(x,pn))),Times(C2,p)),CN1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(x,pn))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,pn,p),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),ZeroQ(Plus(Sqr(b),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),Not(AlgebraicFunctionQ(u,x))))),
ISetDelayed(Int(Times(Power(Plus(Times(Power(x_,pn_DEFAULT),b_DEFAULT),Times(Power(x_,j_DEFAULT),c_DEFAULT),a_DEFAULT),CN1),u_),x_Symbol),
    Condition(Int(RationalFunctionExpand(Times(u,Power(Plus(a,Times(b,Power(x,pn)),Times(c,Power(x,Times(C2,pn)))),CN1)),x),x),And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,pn)))),PositiveIntegerQ(pn)))),
ISetDelayed(Int(Times(Power(v_,p_),u_),x_Symbol),
    Condition(Module(List(Set(m,Exponent(u,x)),Set(pn,Exponent(v,x))),Condition(Module(List(Set(c,Times(Coefficient(u,x,m),Power(Times(Coefficient(v,x,pn),Plus(m,C1,Times(pn,p))),CN1))),w),CompoundExpression(CompoundExpression(Set(c,Times(Coefficient(u,x,m),Power(Times(Coefficient(v,x,pn),Plus(m,C1,Times(pn,p))),CN1))),Set(w,Apart(Plus(u,Times(CN1,c,Power(x,Plus(m,Times(CN1,pn))),Plus(Times(Plus(m,Times(CN1,pn),C1),v),Times(Plus(p,C1),x,D(v,x))))),x))),If(ZeroQ(w),Times(c,Power(x,Plus(m,Times(CN1,pn),C1)),Power(v,Plus(p,C1))),Plus(Times(c,Power(x,Plus(m,Times(CN1,pn),C1)),Power(v,Plus(p,C1))),Int(Times(w,Power(v,p)),x))))),And(And(And(GreaterEqual(Plus(m,C1),pn),Greater(pn,C1)),Less(Plus(m,Times(pn,p)),CN1)),FalseQ(DerivativeDivides(v,u,x))))),And(And(And(And(And(And(RationalQ(p),Less(p,CN1)),PolynomialQ(u,x)),PolynomialQ(v,x)),SumQ(v)),Not(And(MonomialQ(u,x),BinomialQ(v,x)))),Not(And(ZeroQ(Coefficient(u,x,C0)),ZeroQ(Coefficient(v,x,C0)))))))
  );
}