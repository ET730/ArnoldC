import java.util.Scanner;

public class BrainFuck extends BrainFuckBaseVisitor{
    Node mem = new Node();

    @Override
    public Byte visitBegin(BrainFuckParser.BeginContext ctx) {
        return (byte) visit(ctx.com());
    }
    @Override
    public Byte visitLabel(BrainFuckParser.LabelContext ctx) {
        while (mem.value != (byte)0) {
            visit(ctx.com(0));
        }
        return (byte) visit(ctx.com(1));
    }
    @Override
    public Byte visitPrint(BrainFuckParser.PrintContext ctx) {
        System.out.print(mem.print());
        return (byte) visit(ctx.com());
    }
    @Override
    public Byte visitInput(BrainFuckParser.InputContext ctx) {
        Scanner myObj = new Scanner(System.in);
        mem.insert((byte)((int)myObj.next().charAt(0)));
        return (byte) visit(ctx.com());
    }
    @Override
    public Byte visitInc(BrainFuckParser.IncContext ctx) {
        mem.inc();
        return (byte) visit(ctx.com());
    }
    @Override
    public Byte visitDec(BrainFuckParser.DecContext ctx) {
        mem.dec();
        return (byte) visit(ctx.com());
    }
    @Override
    public Byte visitLmov(BrainFuckParser.LmovContext ctx) {
        mem = mem.goLeft();
        return (byte) visit(ctx.com());
    }
    @Override
    public Byte visitRmov(BrainFuckParser.RmovContext ctx) {
        mem = mem.goRight();
        return (byte) visit(ctx.com());
    }
    @Override
    public Byte visitEnd(BrainFuckParser.EndContext ctx) {
        return mem.value;
    }

}
