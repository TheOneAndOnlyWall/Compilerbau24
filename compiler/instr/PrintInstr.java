package compiler.instr;

import java.io.OutputStreamWriter;

import compiler.ExecutionEnvIntf;

public class PrintInstr extends compiler.InstrIntf {
    private compiler.InstrIntf m_expr;

    public PrintInstr(compiler.InstrIntf expr) {
        m_expr = expr;
    }

    @Override
    public void execute(ExecutionEnvIntf env) throws Exception {
        env.getOutputStream().write(Integer.toString(m_expr.getValue()));
    }

    @Override
    public void trace(OutputStreamWriter os) throws Exception {
        os.write("PRINT\n");
    }

}
