package cn.yam.controller;

import cn.yam.domain.Borrowrecords;
import cn.yam.service.BorrowrecordsService;
import cn.yam.service.impl.BorrowrecordsServiceImpl;
import cn.yam.vo.BorrowrecordsVo;
import cn.yam.vo.PageResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * (borrowrecords)表控制层
 *
 * @author xxxxx
 */
@RestController
@RequestMapping("/borrowrecords")
public class BorrowrecordsController {
    /**
     * 服务对象
     */
    @Autowired
    private BorrowrecordsService borrowrecordsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("selectOne")
    public Borrowrecords selectOne(Integer id) {
        return borrowrecordsService.selectByPrimaryKey(id);
    }

    /**
     * 查询所有数据
     *
     * @return 数据列表
     */
    @ApiOperation("查询所有数据")
    @GetMapping("selectAll")
    public List<Borrowrecords> selectAll() {
        return borrowrecordsService.selectAll();
    }

    /**
     * 添加数据
     *
     * @param borrowrecordsVo 实体对象
     * @return 影响行数
     */
    @ApiOperation("添加数据")
    @PostMapping("insert")
    public int insert(@RequestBody BorrowrecordsVo borrowrecordsVo) {
        Borrowrecords record = new Borrowrecords();
        BeanUtils.copyProperties(borrowrecordsVo, record);
        return borrowrecordsService.insert(record);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    @ApiOperation("删除数据")
    @DeleteMapping("delete")
    public int deleteByPrimaryKey(Integer id) {
        return borrowrecordsService.deleteByPrimaryKey(id);
    }

    /**
     * 更新数据
     *
     * @param record 实体对象
     * @return 影响行数
     */
    @ApiOperation("更新数据")
    @PutMapping("update")
    public int updateByPrimaryKey(@RequestBody Borrowrecords record) {
        return borrowrecordsService.updateByPrimaryKey(record);
    }


    /**
     * 根据用户id查询借阅记录
     */
    @ApiOperation("根据用户id查询借阅记录")
    @GetMapping("selectByReaderId")
    public List<Borrowrecords> selectByReaderId(Integer userId) {
        return borrowrecordsService.selectByReaderId(userId);
    }


    /**
     * 根据图书id查询借阅记录
     */

    @ApiOperation("根据图书id查询借阅记录")
    @GetMapping("selectByBookId")
    public List<Borrowrecords> selectByBookId(Integer bookId) {
        return borrowrecordsService.selectByBookId(bookId);
    }

    /**
     * 根据借阅日期范围查询
     */
    @ApiOperation("根据借阅日期范围查询")
    @GetMapping("selectByBorrowDateRange")
    public List<Borrowrecords> selectByBorrowDateBetween(String startDate, String endDate) {
        return borrowrecordsService.selectByBorrowDateBetween(startDate, endDate);
    }


    /**
     * 根据归还日期范围查询
     */
    @ApiOperation("根据归还日期范围查询")
    @GetMapping("selectAllByReturnDateBetween")
    public List<Borrowrecords> selectAllByReturnDateBetween(String startDate, String endDate) {
        return borrowrecordsService.selectAllByReturnDateBetween(startDate, endDate);
    }


    /**
     * 用户用户ID获取所有数据
     */
    @ApiOperation("根据用户ID获取所有数据")
    @GetMapping("selectAllByUserId")
    public List<Borrowrecords> selectAllByUserId(Integer userId) {
        return borrowrecordsService.selectAllByUserId(userId);
    }


    @ApiOperation("根据用户ID分页查询借阅记录")
    @GetMapping("selectPageByUserId")
    public PageResult<Borrowrecords> selectPageByUserId(@RequestParam Integer userId, @RequestParam Integer page, @RequestParam Integer size) {
        return borrowrecordsService.selectPageByUserId(userId, page, size);
    }

}
